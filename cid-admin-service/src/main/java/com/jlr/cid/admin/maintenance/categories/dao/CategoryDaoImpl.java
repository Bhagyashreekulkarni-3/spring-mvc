package com.jlr.cid.admin.maintenance.categories.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jlr.cid.admin.maintenance.categories.controller.CategoryController;
import com.jlr.cid.admin.maintenance.categories.dto.Category;
import com.jlr.cid.admin.maintenance.categories.utilities.CategoryRowMapper;
@Repository
public class CategoryDaoImpl implements CategoryDao {

	final String SEARCH_CATEGORY_QUERY = "SELECT * FROM CATEGORY WHERE id_pk=?";
	public String CATEGORY_RECORDS = "SELECT * FROM CATEGORY";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	EntityManager manager;

	@Override
	public Optional<Category> getCategory(String id) throws Exception {
		Category category = (Category) jdbcTemplate.queryForObject(SEARCH_CATEGORY_QUERY,
				(rs, rowNum) -> CategoryRowMapper.mapRow(rs), new Object[] { id });
		return Optional.ofNullable(category);
	}

	@Override
	public List<Category> getCategoryAll() throws Exception {
		List<Category> categories = jdbcTemplate.query(CATEGORY_RECORDS,
				(rs, rowNum) -> new Category(rs.getString("id_pk"), rs.getString("description"),
						rs.getString("reminder_period"), rs.getString("active_yn"))

		);
		return categories;
	}

	@Override
	public Category getById(String id) {
		// TODO Auto-generated method stub
		Category cats = new Category();
		return cats;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Category> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Category> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Category> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Category> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Category> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Category> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Category, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCategories(Category category) {
		String sql = "INSERT INTO CATEGORY (id_pk, description,reminder_period, active_yn)" + " VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, category.getId_pk(), category.getDescription(), category.getReminder_period(),
				category.getActive_yn());
	}

	@Override
	public void updateCategories(String id, Category category) {
		System.out.println("Reached to dao");
		String sql1 = "UPDATE CATEGORY SET ID_PK=?, DESCRIPTION=?,REMINDER_PERIOD=?,active_yn=? WHERE id_pk=?";
		System.out.println("Stored in sql");
		jdbcTemplate.update(sql1, category.getId_pk(), category.getDescription(), category.getReminder_period(),
				category.getActive_yn());

	}

}
