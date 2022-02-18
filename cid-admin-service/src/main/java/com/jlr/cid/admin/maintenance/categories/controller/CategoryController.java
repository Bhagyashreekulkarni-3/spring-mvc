
//******************************************************************************
//* Copyright (c) 2022 Jaguar LandRover. All Rights Reserved.
//*
//* $Workfile: CategoryController.java $
//* $Revision: 1.0 $
//* $Author: BKULKAR2 $
//* $Date: Jan 05 2022 19:19 $
//*
//******************************************************************************

package com.jlr.cid.admin.maintenance.categories.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jlr.cid.admin.maintenance.categories.dto.Category;
import com.jlr.cid.admin.maintenance.categories.service.CategoryService;

/**
 * This class includes all the restfulApis for Category module
 **/
@RestController
public class CategoryController {

	Logger logger = org.slf4j.LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	CategoryService categoryService;        

	@GetMapping("/admin/maintenance/categories/{id}")                                     //request for specific category id
	EntityModel<Optional<Category>> getCategory(@PathVariable String id) throws Exception {
		logger.info("CategoryController....");
		Optional<Category> category = categoryService.getCategory(id);
		return EntityModel.of(category, linkTo(methodOn(CategoryController.class).getCategory(id)).withSelfRel(),
				linkTo(methodOn(CategoryController.class).getCategoryAll()).withRel("/admin/maintenance/categories"));
	}

	@RequestMapping("/admin/maintenance/categories")                                     //request for categories
	public List<Category> getCategoryAll() throws Exception {
		logger.info("working Controller");
		return categoryService.getCategoryAll();
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/admin/maintenance/categories")
	public void addTopic(@RequestBody Category category) throws Exception{
		categoryService.addCategory(category);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/admin/maintenance/categories/{id}")
	public void updateTopic(@RequestBody Category category,@PathVariable String id) throws Exception{
		categoryService.updateCategory(id,category);
	}
	
	
}

