package main;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
/*
@org.springframework.stereotype.Repository
public class Repository {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Order_Book> findAll(){
		String sql = "SELECT * FROM order_book";
		List<Order_Book> order_books  = jdbcTemplate.query(sql,	new BeanPropertyRowMapper(Order_Book.class));
		return order_books;
	}
}
*/

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Order_Book, String> {
}