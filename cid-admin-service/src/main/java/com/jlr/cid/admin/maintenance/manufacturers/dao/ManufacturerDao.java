package com.jlr.cid.admin.maintenance.manufacturers.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;

public interface ManufacturerDao extends JpaRepository<Manufacturer,String> {

	Optional<Manufacturer> getManufacturer(String id) throws Exception;

	List<Manufacturer> getManufacturerAll() throws Exception;

}
