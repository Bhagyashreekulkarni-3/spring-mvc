package com.jlr.cid.admin.maintenance.categories.service;

import java.util.List;
import java.util.Optional;

import com.jlr.cid.admin.maintenance.categories.dto.Category;

public interface CategoryService {

	Optional<Category> getCategory(String id) throws Exception;

	List<Category> getCategoryAll() throws Exception;

	void addCategory(Category category);

	void updateCategory(String id, Category category);

}
