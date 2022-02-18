package com.jlr.cid.admin.maintenance.costcentres.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;

public interface CostCentreService {

	Optional<CostCentre> getCostCentre(String id) throws Exception;

	List<CostCentre> getCostCentreAll() throws Exception;

	
	

}
