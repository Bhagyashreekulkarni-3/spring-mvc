package com.jlr.cid.admin.maintenance.departments.dao;

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

import com.jlr.cid.admin.maintenance.departments.dto.Department;
import com.jlr.cid.admin.maintenance.locations.dao.LocationDao;
import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.departments.utilities.DepartmentRowMapper;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	final String SEARCH_DEPARTMENT_QUERY = "SELECT * FROM DEPARTMENT WHERE id_pk=?";
	public String DEPARTMENT_RECORDS = "SELECT * FROM DEPARTMENT";

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	EntityManager manager;

	@Override
	public Optional<Department> getDepartment(String id) throws Exception {
		Department department = (Department) jdbcTemplate.queryForObject(SEARCH_DEPARTMENT_QUERY,
				(rs, rowNum) -> DepartmentRowMapper.mapRow(rs), new Object[] { id });
		return Optional.ofNullable(department);
	}

	@Override
	public List<Department> getDepartmentAll() throws Exception {
		List<Department> department = jdbcTemplate.query(DEPARTMENT_RECORDS,
				(rs, rowNum) -> new Department(rs.getString("id_pk"),
				rs.getString("name"),rs.getString("building"),rs.getString("location_id_fk")
				,rs.getString("custodian_owner"),rs.getString("calibration_facility_yn"),
				rs.getString("maximum_instruments"),rs.getString("active_yn"),
				rs.getString("external_yn"),rs.getString("cost_centre_1_id_fk"),
				rs.getString("cost_centre_2_id_fk"),rs.getString("cost_centre_3_id_fk"),
				rs.getString("telephone"),rs.getString("contact_name"),
				rs.getString("secondary_owner"),
				rs.getString("owner_application"),rs.getString("department_code"),
				rs.getString("departmentcode2"),
				rs.getString("departmentcode3"),rs.getString("test"),rs.getString("test2"),
			rs.getString("testb"),
			rs.getString("testc") 
				

				

		));
		System.out.println("DAO working");
		return department;
	}

	@Override
	public Department getById(String id) {
		// TODO Auto-generated method stub
		Department department = new Department();
		return department;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Department> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Department> entities) {
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
	public Department getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Department> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> findById(String id) {
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
	public void delete(Department entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Department> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Department> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Department> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Department, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


}
