package com.jlr.cid.admin.maintenance.locations.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;
import com.jlr.cid.admin.maintenance.locations.dto.Location;

public interface LocationDao extends JpaRepository<Location, String> {

	Optional<Location> getLocation(String id) throws Exception;

	List<Location> getLocationAll() throws Exception;

}
