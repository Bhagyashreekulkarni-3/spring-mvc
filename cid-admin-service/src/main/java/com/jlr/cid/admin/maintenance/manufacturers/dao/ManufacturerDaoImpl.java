package com.jlr.cid.admin.maintenance.manufacturers.dao;

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

import com.jlr.cid.admin.maintenance.manufacturers.utilities.ManufacturerRowMapper;
import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;

@Repository
public class ManufacturerDaoImpl implements ManufacturerDao {

	final String SEARCH_MANUFACTURER_QUERY = "SELECT * FROM MANUFACTURER WHERE id_pk=?";
	public String MANUFACTURER_RECORDS = "SELECT * FROM MANUFACTURER";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	EntityManager manager;

	@Override
	public Optional<Manufacturer> getManufacturer(String id) throws Exception {
		Manufacturer manufacturer = (Manufacturer) jdbcTemplate.queryForObject(SEARCH_MANUFACTURER_QUERY,
				(rs, rowNum) -> ManufacturerRowMapper.mapRow(rs), new Object[] { id });
		return Optional.ofNullable(manufacturer);
	}

	@Override
	public List<Manufacturer> getManufacturerAll() throws Exception {
		List<Manufacturer> manufacturer = jdbcTemplate.query(MANUFACTURER_RECORDS,
				(rs, rowNum) -> new Manufacturer(rs.getString("id_pk"),rs.getString("name"),
				rs.getString("address1"),rs.getString("address2"),
				rs.getString("town"),
				rs.getString("county"),rs.getString("post_code"),rs.getString("telephone_number"),
				rs.getString("contact_name"),rs.getString("active_yn")

				

		));
		System.out.println("DAO working");
		return manufacturer;
	}

	@Override
	public Manufacturer getById(String id) {
		// TODO Auto-generated method stub
		Manufacturer manufacturer = new Manufacturer();
		return manufacturer;
	}

	@Override
	public List<Manufacturer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manufacturer> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manufacturer> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Manufacturer> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Manufacturer> entities) {
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
	public Manufacturer getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Manufacturer> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Manufacturer> findById(String id) {
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
	public void delete(Manufacturer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Manufacturer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Manufacturer> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Manufacturer> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Manufacturer> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Manufacturer, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


}
