package com.jlr.cid.admin.maintenance.locations.service;

import java.util.List;
import java.util.Optional;

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;
import com.jlr.cid.admin.maintenance.locations.dto.Location;

public interface LocationService {

	
	Optional<Location> getLocation(String id) throws Exception;

	List<Location> getLocationAll() throws Exception;
	

	

	

}
