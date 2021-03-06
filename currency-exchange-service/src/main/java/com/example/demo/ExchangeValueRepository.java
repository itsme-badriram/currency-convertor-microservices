package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class ExchangeValueRepository {
	 
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public ExchangeValue findByFromAndTo(String from, String to) {
		 String sql = "SELECT * FROM exchange_value WHERE currency_from = '" + from + "' AND currency_to =  '" + to + "'";
		 System.out.println(sql);
		    ExchangeValue exchangeValue = jdbcTemplate.queryForObject(sql, new ExchangeValueRowMapper());
		    System.out.println(exchangeValue);
		    return exchangeValue;
		
	}
}
