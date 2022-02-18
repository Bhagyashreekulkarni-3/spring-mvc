package com.jlr.cid.admin.maintenance.departments.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import com.jlr.cid.admin.maintenance.departments.dto.Department;

public class DepartmentRowMapper implements RowMapper<Department> {

	public static Department mapRow(ResultSet rs) throws SQLException {
		Department department = new Department();

		department.setId_dep(rs.getString("id_pk"));
		department.setName_dep(rs.getString("name"));
		department.setBuilding(rs.getString("building"));
		department.setLoc_id(rs.getString("location_id_fk"));
		department.setCust_owner(rs.getString("custodian_owner"));
		department.setCab_fac(rs.getString("calibration_facility_yn"));
		department.setMax_ins(rs.getString("maximum_instruments"));
		department.setActive_dep(rs.getString("active_yn"));
		department.setExternal(rs.getString("external_yn"));
		department.setCostcentre1(rs.getString("cost_centre_1_id_fk"));
		department.setCostcentre2(rs.getString("cost_centre_2_id_fk"));
		department.setCostcentre3(rs.getString("cost_centre_3_id_fk"));
		department.setTelephone(rs.getString("telephone"));
		department.setContact_name(rs.getString("contact_name"));
		department.setSec_owner(rs.getString("secondary_owner"));
		department.setOwner_app(rs.getString("owner_application"));
		department.setDeptcode1(rs.getString("department_code"));
		department.setDeptcode2(rs.getString("departmentcode2"));
		department.setDeptcode3(rs.getString("departmentcode3"));
		department.setTest(rs.getString("test"));
		department.setTest2(rs.getString("test2"));
		department.setTestb(rs.getString("testb"));
		department.setTestc(rs.getString("testc"));
		

		return department;
	}

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}


}
