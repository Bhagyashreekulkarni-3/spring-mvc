package com.jlr.cid.admin.maintenance.locations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.locations.dao.LocationDao;
import com.jlr.cid.admin.maintenance.locations.dto.Location;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationDao locationDao;

	@Override
	public Optional<Location> getLocation(String id) throws Exception {
		
		System.out.println("Service");
		return locationDao.getLocation(id) ;
	}

	@Override
	public List<Location> getLocationAll() throws Exception {
		// TODO Auto-generated method stub
		return locationDao.getLocationAll();
	}

}
