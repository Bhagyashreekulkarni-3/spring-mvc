package com.jlr.cid.admin.maintenance.costcentres.dao;

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
import com.jlr.cid.admin.maintenance.costcentres.utilities.CostCentreRowMapper;
import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;
@Repository
public class CostCentreDaoImpl implements CostCentreDao {

	final String SEARCH_COSTCENTRE_QUERY = "SELECT * FROM COST_CENTRE WHERE id_pk=?";
	public String COSTCENTRE_RECORDS = "SELECT * FROM COST_CENTRE";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	EntityManager manager;

	@Override
	public Optional<CostCentre> getCostCentre(String id) throws Exception {
		CostCentre costcentre = (CostCentre) jdbcTemplate.queryForObject(SEARCH_COSTCENTRE_QUERY,
				(rs, rowNum) -> CostCentreRowMapper.mapRow(rs), new Object[] { id });
		return Optional.ofNullable(costcentre);
	}

	@Override
	public List<CostCentre> getCostCentreAll() throws Exception {
		List<CostCentre> costcentre = jdbcTemplate.query(COSTCENTRE_RECORDS,
				(rs, rowNum) -> new CostCentre(rs.getString("id_pk"), rs.getString("code")
						,rs.getString("functional_area_rv_id_fk"),rs.getString("description"),
						 rs.getString("active_yn"))

				

		);
		System.out.println("DAO working");
		return costcentre;
	}

	@Override
	public CostCentre getById(String id) {
		// TODO Auto-generated method stub
		CostCentre cost = new CostCentre();
		return cost;
	}

	@Override
	public List<CostCentre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CostCentre> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CostCentre> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CostCentre> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<CostCentre> entities) {
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
	public CostCentre getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<CostCentre> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CostCentre> findById(String id) {
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
	public void delete(CostCentre entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends CostCentre> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends CostCentre> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CostCentre> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends CostCentre> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends CostCentre, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	



}
