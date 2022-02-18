package com.jlr.cid.admin.maintenance.departments.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.departments.dto.Department;

public interface DepartmentDao extends JpaRepository<Department,String> {


	List<Department> getDepartmentAll() throws Exception;

	Optional<Department> getDepartment(String id)throws Exception;

}
