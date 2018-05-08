package main;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_book")
public class Order_Book {
	@Id
	private String order_id;
	private String cust_id;
	private String item_id;
	private int item_quantity, total_amount;
	private float item_price;
	private Date order_date, exp_delivery_date;
	private String status;
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
	public int getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	public float getItem_price() {
		return item_price;
	}
	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Date getExp_delivery_date() {
		return exp_delivery_date;
	}
	public void setExp_delivery_date(Date exp_delivery_date) {
		this.exp_delivery_date = exp_delivery_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order_Book(String order_id, String cust_id, String item_id, int item_quantity, int total_amount,
			float item_price, Date order_date, Date exp_delivery_date, String status) {
		super();
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.item_id = item_id;
		this.item_quantity = item_quantity;
		this.total_amount = total_amount;
		this.item_price = item_price;
		this.order_date = order_date;
		this.exp_delivery_date = exp_delivery_date;
		this.status = status;
	}
	
	public Order_Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order_Book [order_id=" + order_id + ", cust_id=" + cust_id + ", item_id=" + item_id + ", item_quantity="
				+ item_quantity + ", total_amount=" + total_amount + ", item_price=" + item_price + ", order_date="
				+ order_date + ", exp_delivery_date=" + exp_delivery_date + ", status=" + status + "]";
	}
	
}
