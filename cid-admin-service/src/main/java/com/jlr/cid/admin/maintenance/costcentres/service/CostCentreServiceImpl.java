
package com.jlr.cid.admin.maintenance.costcentres.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.categories.dao.CategoryDao;
import com.jlr.cid.admin.maintenance.categories.dto.Category;
import com.jlr.cid.admin.maintenance.costcentres.dao.CostCentreDao;
import com.jlr.cid.admin.maintenance.costcentres.dto.CostCentre;
@Service
public class CostCentreServiceImpl implements CostCentreService {

	@Autowired
	CostCentreDao costCentreDao;

	@Override
	public Optional<CostCentre> getCostCentre(String id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service");
		return costCentreDao.getCostCentre(id) ;
	}

	@Override
	public List<CostCentre> getCostCentreAll() throws Exception {
		// TODO Auto-generated method stub
		return costCentreDao.getCostCentreAll();
	}

	

	


	

}
