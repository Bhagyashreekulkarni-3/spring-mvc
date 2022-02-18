package com.jlr.cid.admin.maintenance.locations.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.locations.service.LocationService;

@RestController
public class LocationController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(LocationController.class);
    
	@Autowired
	LocationService locationService;


	@GetMapping("/admin/maintenance/locations/{id}")                                     //request for specific category id
	EntityModel<Optional<Location>> getLocation(@PathVariable String id) throws Exception {
		logger.info("LocationController....");
		Optional<Location> location = locationService.getLocation(id);
		return EntityModel.of(location, linkTo(methodOn(LocationController.class).getLocation(id)).withSelfRel(),
				linkTo(methodOn(LocationController.class).getLocationAll()).withRel("/admin/maintenance/locations"));
	}

	@RequestMapping("/admin/maintenance/locations")                                     //request for categories
	public List<Location> getLocationAll() throws Exception {
		logger.info("LocationController");
		return locationService.getLocationAll();
		
	}
	
}


