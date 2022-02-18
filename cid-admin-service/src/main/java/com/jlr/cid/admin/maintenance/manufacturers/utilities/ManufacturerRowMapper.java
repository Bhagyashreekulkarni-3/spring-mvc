package com.jlr.cid.admin.maintenance.manufacturers.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;

public class ManufacturerRowMapper implements RowMapper<Manufacturer> {

	public static Manufacturer mapRow(ResultSet rs) throws SQLException {
		Manufacturer manufacturer = new Manufacturer();
        
		manufacturer.setId_manfac(rs.getString("id_pk"));
		manufacturer.setName_manfac(rs.getString("name"));
		manufacturer.setAddress1_manfac(rs.getString("address1"));
		manufacturer.setAddress2_manfac(rs.getString("address2"));
		manufacturer.setTown_manfac(rs.getString("town"));
		manufacturer.setCounty_manfac(rs.getString("county"));
		manufacturer.setPost_code_manfac(rs.getString("post_code"));
		manufacturer.setTel_manfac(rs.getString("telephone_number"));
		manufacturer.setContact_manfac(rs.getString("contact_name"));
		manufacturer.setActive_manfac(rs.getString("active_yn"));

		return manufacturer;
	}

	@Override
	public Manufacturer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
