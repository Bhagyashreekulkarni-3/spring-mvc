
//******************************************************************************
//* Copyright (c) 2022 Jaguar LandRover. All Rights Reserved.
//*
//* $Workfile: CategoryController.java $
//* $Revision: 1.0 $
//* $Author: BKULKAR2 $
//* $Date: Jan 05 2022 19:19 $
//*
//******************************************************************************

package com.jlr.cid.admin.maintenance.categories.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.categories.dao.CategoryDao;
import com.jlr.cid.admin.maintenance.categories.dto.Category;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;

	@Override
	@Transactional
	public Optional<Category> getCategory(String id) throws Exception {
		System.out.println("Request received in service for id" + id);
		return categoryDao.getCategory(id);
	}

	@Override
	public List<Category> getCategoryAll() throws Exception {
		return categoryDao.getCategoryAll();
	}

	@Override
	public void addCategory(Category category) {
		   categoryDao.addCategories(category);
		
	}

	@Override
	public void updateCategory(String id, Category category) {
		System.out.print("Service working");
		categoryDao.updateCategories(id,category);
		
	}


	

}
