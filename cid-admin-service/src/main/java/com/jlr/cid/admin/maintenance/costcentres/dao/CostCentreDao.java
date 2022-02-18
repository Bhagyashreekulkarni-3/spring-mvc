package com.jlr.cid.admin.maintenance.costcentres.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;

public interface CostCentreDao extends JpaRepository<CostCentre, String>{

	Optional<CostCentre> getCostCentre(String id) throws Exception;

	List<CostCentre> getCostCentreAll() throws Exception;


}
