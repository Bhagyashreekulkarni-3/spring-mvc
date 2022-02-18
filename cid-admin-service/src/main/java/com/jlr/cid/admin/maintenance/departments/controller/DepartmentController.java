package com.jlr.cid.admin.maintenance.departments.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlr.cid.admin.maintenance.departments.dto.Department;
import com.jlr.cid.admin.maintenance.departments.service.DepartmentService;
import com.jlr.cid.admin.maintenance.locations.controller.LocationController;
import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.locations.service.LocationService;

@RestController
public class DepartmentController {
Logger logger = org.slf4j.LoggerFactory.getLogger(LocationController.class);
    
	@Autowired
	DepartmentService departmentService;


	@GetMapping("/admin/maintenance/departments/{id}")                                     //request for specific category id
	EntityModel<Optional<Department>> getDepartment(@PathVariable String id) throws Exception {
		logger.info("DepartmentController....");
		Optional<Department> department = departmentService.getDepartment(id);
		return EntityModel.of(department, linkTo(methodOn(DepartmentController.class).getDepartment(id)).withSelfRel(),
				linkTo(methodOn(DepartmentController.class).getDepartmentAll()).withRel("/admin/maintenance/departments"));
	}

	@RequestMapping("/admin/maintenance/departments")                                     //request for categories
	public List<Department> getDepartmentAll() throws Exception {
		logger.info("DepartmentController");
		return departmentService.getDepartmentAll();
		
	}
	

}
