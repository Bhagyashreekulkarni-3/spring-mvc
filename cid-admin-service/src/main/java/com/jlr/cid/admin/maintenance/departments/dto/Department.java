package com.jlr.cid.admin.maintenance.departments.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private String id_dep;
	private String name_dep;
	private String building;
	private String loc_id;
	private String cust_owner;
	private String cab_fac;
	private String max_ins;
	private String active_dep;
	private String external;
	private String costcentre1;
	private String costcentre2;
	private String costcentre3;
	private String telephone;
	private String contact_name;
	private String sec_owner;
	private String owner_app;
	private String deptcode1;
	private String deptcode2;
	private String deptcode3;
	private String test;
	private String test2;
	private String testb;
	private String testc;
	
	
	public Department() {                         //Created simple constructor
    }
	
	public Department(String id_dep, String name_dep, String building, String loc_id, String cust_owner, String cab_fac,
			String max_ins, String active_dep, String external, String costcentre1, String costcentre2,
			String costcentre3, String telephone, String contact_name, String sec_owner, String owner_app,
			String deptcode1, String deptcode2, String deptcode3, String test, String test2, String testb,
			String testc) {
		super();
		this.id_dep = id_dep;
		this.name_dep = name_dep;
		this.building = building;
		this.loc_id = loc_id;
		this.cust_owner = cust_owner;
		this.cab_fac = cab_fac;
		this.max_ins = max_ins;
		this.active_dep = active_dep;
		this.external = external;
		this.costcentre1 = costcentre1;
		this.costcentre2 = costcentre2;
		this.costcentre3 = costcentre3;
		this.telephone = telephone;
		this.contact_name = contact_name;
		this.sec_owner = sec_owner;
		this.owner_app = owner_app;
		this.deptcode1 = deptcode1;
		this.deptcode2 = deptcode2;
		this.deptcode3 = deptcode3;
		this.test = test;
		this.test2 = test2;
		this.testb = testb;
		this.testc = testc;
	}
	public String getId_dep() {
		return id_dep;
	}
	public void setId_dep(String id_dep) {
		this.id_dep = id_dep;
	}
	public String getName_dep() {
		return name_dep;
	}
	public void setName_dep(String name_dep) {
		this.name_dep = name_dep;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
	}
	public String getCust_owner() {
		return cust_owner;
	}
	public void setCust_owner(String cust_owner) {
		this.cust_owner = cust_owner;
	}
	public String getCab_fac() {
		return cab_fac;
	}
	public void setCab_fac(String cab_fac) {
		this.cab_fac = cab_fac;
	}
	public String getMax_ins() {
		return max_ins;
	}
	public void setMax_ins(String max_ins) {
		this.max_ins = max_ins;
	}
	public String getActive_dep() {
		return active_dep;
	}
	public void setActive_dep(String active_dep) {
		this.active_dep = active_dep;
	}
	public String getExternal() {
		return external;
	}
	public void setExternal(String external) {
		this.external = external;
	}
	public String getCostcentre1() {
		return costcentre1;
	}
	public void setCostcentre1(String costcentre1) {
		this.costcentre1 = costcentre1;
	}
	public String getCostcentre2() {
		return costcentre2;
	}
	public void setCostcentre2(String costcentre2) {
		this.costcentre2 = costcentre2;
	}
	public String getCostcentre3() {
		return costcentre3;
	}
	public void setCostcentre3(String costcentre3) {
		this.costcentre3 = costcentre3;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getSec_owner() {
		return sec_owner;
	}
	public void setSec_owner(String sec_owner) {
		this.sec_owner = sec_owner;
	}
	public String getOwner_app() {
		return owner_app;
	}
	public void setOwner_app(String owner_app) {
		this.owner_app = owner_app;
	}
	public String getDeptcode1() {
		return deptcode1;
	}
	public void setDeptcode1(String detpcode1) {
		this.deptcode1 = detpcode1;
	}
	public String getDeptcode2() {
		return deptcode2;
	}
	public void setDeptcode2(String deptcode2) {
		this.deptcode2 = deptcode2;
	}
	public String getDeptcode3() {
		return deptcode3;
	}
	public void setDeptcode3(String deptcode3) {
		this.deptcode3 = deptcode3;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	public String getTestb() {
		return testb;
	}
	public void setTestb(String testb) {
		this.testb = testb;
	}
	public String getTestc() {
		return testc;
	}
	public void setTestc(String testc) {
		this.testc = testc;
	}
	
	 @Override
	    public String toString() {
	        return "DepartmentDto{" +
	        		"id_dep='" + id_dep + '\'' +
	                "building='" + building + '\'' +
	                ", loc_id='" + loc_id + '\'' +
	                ", cust_owner='" + cust_owner + '\'' +
	                ", cab_fac='" + cab_fac + '\'' +
	                ", max_ins='" + max_ins + '\'' +
	                ", active_dep='" + active_dep + '\'' +
	                ", external='" + external + '\'' +
	                ", costcentre1='" + costcentre1 + '\'' +
	                ", costcentre2='" + costcentre2 + '\'' +
	                ", costcentre3='" + costcentre3 + '\'' +
	                ", telephone='" + telephone + '\'' +
	                ", contact_name='" + contact_name + '\'' +
	                ", sec_owner='" + sec_owner + '\'' +
	                ", owner_app='" + owner_app + '\'' +
	                ", deptcode1='" + deptcode1 + '\'' +
	                ", deptcode2='" + deptcode2 + '\'' +
	                ", deptcode3='" + deptcode3 + '\'' +
	                ", test='" + test + '\'' +
	                ", test2='" + test2 + '\'' +
	                ", testb='" + testb + '\'' +
	                ", testc='" + testc + '\'' +
	                	                
	                '}';
	    }

}
