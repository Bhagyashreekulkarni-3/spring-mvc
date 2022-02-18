package com.jlr.cid.admin.maintenance.manufacturers.service;

import java.util.List;
import java.util.Optional;

import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;

public interface ManufacturerService {

	Optional<Manufacturer> getManufacturer(String id) throws Exception;

	
	List<Manufacturer> getManufacturerAll() throws Exception;

}
