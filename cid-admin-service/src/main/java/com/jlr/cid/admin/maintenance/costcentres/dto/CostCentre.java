package com.jlr.cid.admin.maintenance.costcentres.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CostCentre {
	
	@Id
	private String id;
	private String code;
	private String functional_area;
	private String desc;
	private String active;
	
	public CostCentre(String id, String code, String functional_area, String desc, String active) {
		super();
		this.id = id;
		this.code = code;
		this.functional_area = functional_area;
		this.desc = desc;
		this.active = active;
	}


	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getFunctional_area() {
		return functional_area;
	}


	public void setFunctional_area(String functional_area) {
		this.functional_area = functional_area;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	public CostCentre() {                         //Created simple constructor
    }
	
	
	@Override
    public String toString() {
        return "CostCentreDto{" +
                "id='" + id + '\'' +
                 ", code='" + code + '\'' +
                ",functional_area='"+functional_area+'\''+
                ", desc='" + desc + '\'' +
                ", active='" + active + '\'' +
                	                
                '}';
    }
	
	

}
