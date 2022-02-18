package com.jlr.cid.admin.maintenance.manufacturers.Controller;

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

import com.jlr.cid.admin.maintenance.locations.controller.LocationController;
import com.jlr.cid.admin.maintenance.locations.dto.Location;
import com.jlr.cid.admin.maintenance.locations.service.LocationService;
import com.jlr.cid.admin.maintenance.manufacturers.dto.Manufacturer;
import com.jlr.cid.admin.maintenance.manufacturers.service.ManufacturerService;

@RestController
public class ManufacturerController {
Logger logger = org.slf4j.LoggerFactory.getLogger(LocationController.class);
    
	@Autowired
	ManufacturerService manufacturerService;


	@GetMapping("/admin/maintenance/manufacturers/{id}")                                     //request for specific category id
	EntityModel<Optional<Manufacturer>> getManufacturer(@PathVariable String id) throws Exception {
		logger.info("LocationController....");
		Optional<Manufacturer> manufacturer = manufacturerService.getManufacturer(id);
		return EntityModel.of(manufacturer, linkTo(methodOn(ManufacturerController.class).getManufacturer(id)).withSelfRel(),
				linkTo(methodOn(ManufacturerController.class).getManufacturerAll()).withRel("/admin/maintenance/manufacturers"));
	}

	@RequestMapping("/admin/maintenance/manufacturers")                                     //request for categories
	public List<Manufacturer> getManufacturerAll() throws Exception {
		logger.info("ManufacturerController");
		return manufacturerService.getManufacturerAll();
		
	}
	
}
