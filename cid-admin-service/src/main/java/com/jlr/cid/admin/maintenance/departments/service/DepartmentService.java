package com.jlr.cid.admin.maintenance.departments.service;

import java.util.List;
import java.util.Optional;

import com.jlr.cid.admin.maintenance.departments.dto.Department;

public interface DepartmentService {

	List<Department> getDepartmentAll() throws Exception;

	Optional<Department> getDepartment(String id) throws Exception;

}
