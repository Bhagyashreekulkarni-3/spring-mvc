package com.jlr.cid.admin.maintenance.categories.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.categories.dto.Category;

public interface CategoryDao extends JpaRepository<Category, String>{

	Optional<Category> getCategory(String id) throws Exception;

	List<Category> getCategoryAll() throws Exception;

	void addCategories(Category category);

	void updateCategories(String id, Category category);

}
