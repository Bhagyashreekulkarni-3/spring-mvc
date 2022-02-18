package com.jlr.cid.admin.maintenance.costcentres.controller;

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

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;
import com.jlr.cid.admin.maintenance.costcentres.service.CostCentreService;

	@RestController
	public class CostCentreController {

		Logger logger = org.slf4j.LoggerFactory.getLogger(CostCentreController.class);
        
		@Autowired
		CostCentreService costCentreService;


		@GetMapping("/admin/maintenance/costcentres/{id}")                                     //request for specific category id
		EntityModel<Optional<CostCentre>> getCostCentre(@PathVariable String id) throws Exception {
			logger.info("CostCentreController....");
			Optional<CostCentre> costcentre = costCentreService.getCostCentre(id);
			return EntityModel.of(costcentre, linkTo(methodOn(CostCentreController.class).getCostCentre(id)).withSelfRel(),
					linkTo(methodOn(CostCentreController.class).getCostCentreAll()).withRel("/admin/maintenance/costcentres"));
		}

		@RequestMapping("/admin/maintenance/costcentres")                                     //request for categories
		public List<CostCentre> getCostCentreAll() throws Exception {
			logger.info("working Controller");
			return costCentreService.getCostCentreAll();
			
		}
		
}
