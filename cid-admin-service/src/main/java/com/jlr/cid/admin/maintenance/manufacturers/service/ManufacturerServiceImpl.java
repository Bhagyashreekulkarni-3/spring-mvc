package com.jlr.cid.admin.maintenance.manufacturers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.manufacturers.dao.ManufacturerDao;
import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
	
	@Autowired
	ManufacturerDao manufacturerDao;

	@Override
	public Optional<Manufacturer> getManufacturer(String id) throws Exception {
		// TODO Auto-generated method stub
		return manufacturerDao.getManufacturer(id);
	}

	@Override
	public List<Manufacturer> getManufacturerAll() throws Exception {
		// TODO Auto-generated method stub
		return manufacturerDao.getManufacturerAll();
	}

}
