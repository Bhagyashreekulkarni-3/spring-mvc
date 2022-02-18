package com.jlr.cid.admin.maintenance.news.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jlr.cid.admin.maintenance.news.dto.News;
import com.jlr.cid.admin.maintenance.news.utilities.NewsRowMapper;

@Repository
public class NewsDaoImpl implements NewsDao {

	final String SEARCH_NEWS_QUERY = "SELECT * FROM CID_SYSTEM_NEWS WHERE id_pk=?";
	public String NEWS_RECORDS = "SELECT * FROM CID_SYSTEM_NEWS";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	EntityManager manager;

	@Override
	public Optional<News> getNews(String id) throws Exception {
		News news = (News) jdbcTemplate.queryForObject(SEARCH_NEWS_QUERY,
				(rs, rowNum) -> NewsRowMapper.mapRow(rs), new Object[] { id });
		return Optional.ofNullable(news);
	}

	@Override
	public List<News> getNewsAll() throws Exception {
		List<News> news = jdbcTemplate.query(NEWS_RECORDS,
				(rs, rowNum) -> new News(rs.getString("id_pk"),("start_date"),rs.getString("end_date"),
						rs.getString("headline"),rs.getString("summary"),rs.getString("content")

				

		));
		System.out.println("DAO working");
		return news;
	}

	@Override
	public News getById(String id) {
		// TODO Auto-generated method stub
		News news = new News();
		return news;
	}

	@Override
	public List<News> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<News> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends News> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<News> entities) {
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
	public News getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<News> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<News> findById(String id) {
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
	public void delete(News entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends News> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends News> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends News> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends News> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends News, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
