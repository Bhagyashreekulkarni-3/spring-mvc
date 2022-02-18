package com.jlr.cid.admin.maintenance.categories.utilities;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jlr.cid.admin.maintenance.categories.dto.Category;


/**
* Row Mapper utility for generic CRUD operations on a Instrument repository.
*
* @author Bhagyashree K
*/

public class CategoryRowMapper implements RowMapper<Category> {

	public static Category mapRow(ResultSet rs) throws SQLException {
		Category category = new Category();

		category.setId_pk(rs.getString("id_pk"));
		category.setDescription(rs.getString("description"));
		category.setReminder_period(rs.getString("reminder_period"));
		category.setActive_yn(rs.getString("active_yn"));

		
		return category;
	}

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}
}
