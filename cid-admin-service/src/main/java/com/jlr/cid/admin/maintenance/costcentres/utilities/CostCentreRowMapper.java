package com.jlr.cid.admin.maintenance.costcentres.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;

public class CostCentreRowMapper implements RowMapper<CostCentre> {

	public static CostCentre mapRow(ResultSet rs) throws SQLException {
		CostCentre costcentre = new CostCentre();

		costcentre.setId(rs.getString("id_pk"));
		costcentre.setCode(rs.getString("code"));
		costcentre.setFunctional_area(rs.getString("functional_area_rv_id_fk"));
		costcentre.setDesc(rs.getString("description"));
		costcentre.setActive(rs.getString("active_yn"));
		

		return costcentre;
	}

	@Override
	public CostCentre mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}

}
