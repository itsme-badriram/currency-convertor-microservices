package com.example.demo;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExchangeValueRowMapper implements RowMapper<ExchangeValue>{

	@Override
	public ExchangeValue mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ExchangeValue exchangeValue = new ExchangeValue();
		exchangeValue.setId(rs.getLong("id"));
		exchangeValue.setFrom(rs.getString("currency_from"));
		exchangeValue.setTo(rs.getString("currency_to"));
		exchangeValue.setConversionMultiple(new BigDecimal(rs.getDouble("conversion_multiple")));
		
		
		return exchangeValue;
	}
	
	

}
