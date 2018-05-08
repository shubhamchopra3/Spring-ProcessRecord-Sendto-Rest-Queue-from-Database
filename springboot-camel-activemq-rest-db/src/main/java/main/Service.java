package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.google.gson.Gson;

public class Service {
	@Autowired
	Repository repo1;
	List<Map<String, Object>> common_mp1 = new ArrayList<Map<String, Object>>();
	/*
	public void printMessage(Map<String, Object> data) {
		System.out.println(data.get("order_date").getClass());
	}
	@SuppressWarnings("unchecked")
	public HashMap<String, String> jsonToHashMap(String data) {
		data=data.trim();
		HashMap<String, String> hm1 = new Gson().fromJson(data, new HashMap<String, String>().getClass());
		return hm1;
	}
	public Iterable<Order_Book> findBooks() {
		System.out.println("Inside service class function");
        return repo1.findAll();
    }
	*/
	public String mapToString(Map<String, Object> data) {
		String msg="{";
		int i=0;
		List<String> al1 = new ArrayList<String>(data.keySet());
		for(String key: al1) {
			msg += key + ":";
			msg += data.get(key);
			if(i!=(al1.size()-1)) {
				msg += ",";
			}
			i++;
		}
		msg += "}";
		return  msg;
	}
	public Map<String, Object> updateValues(Map<String, Object> data) {
		int dayAdd = 3;
		String newStatus = "PROCESSED";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD-MM-YYYY");
		Calendar c = Calendar.getInstance();
		
		c.setTime((Date) data.get("ORDER_DATE"));
		
		java.util.Date date1 = c.getTime();
		java.sql.Date sqlStartDate = new java.sql.Date(date1.getTime()); 
		data.put("ORDER_DATE", sqlStartDate);
		
		c.add(Calendar.DATE, dayAdd);
		date1 = c.getTime();
		sqlStartDate = new java.sql.Date(date1.getTime()); 
		data.put("EXP_DELIVERY_DATE", sqlStartDate);
		data.put("STATUS", newStatus);
		
		common_mp1.add(data);
		
		return data;
	}
	public List<Map<String, Object>> returnRecord() {
		return common_mp1;
	}
	
	public void clearHashmap() {
		common_mp1.clear();
	}
	
}
