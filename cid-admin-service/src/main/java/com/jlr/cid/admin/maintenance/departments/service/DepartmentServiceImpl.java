package com.jlr.cid.admin.maintenance.departments.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.departments.dao.DepartmentDao;
import com.jlr.cid.admin.maintenance.departments.dto.Department;
import com.jlr.cid.admin.maintenance.locations.dao.LocationDao;
import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.locations.service.LocationService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDao departmentDao;

	

	@Override
	public List<Department> getDepartmentAll() throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.getDepartmentAll();
	}

	@Override
	public Optional<Department> getDepartment(String id) throws Exception {
		// TODO Auto-generated method stub
		return departmentDao.getDepartment(id);
	}

}
