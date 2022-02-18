package com.jlr.cid.admin.maintenance.locations.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jlr.cid.admin.maintenance.locations.dto.Location;

public class LocationRowMapper implements RowMapper<Location> {

	public static Location mapRow(ResultSet rs) throws SQLException {
		Location location = new Location();

		location.setName(rs.getString("name"));
		location.setAddress1(rs.getString("address1"));
		location.setTown(rs.getString("town"));
		location.setId_loc(rs.getString("id_pk"));
		location.setAddress2(rs.getString("address2"));
		location.setPost_code(rs.getString("post_code"));
		location.setCounty(rs.getString("county"));
		location.setActive_loc(rs.getString("active_yn"));

		return location;
	}

	@Override
	public Location mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
