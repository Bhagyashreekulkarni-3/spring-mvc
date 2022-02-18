package com.jlr.cid.admin.maintenance.manufacturers.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Manufacturer {
	
	@Id
	private String id_manfac;
	private String name_manfac;
	private String address1_manfac;
	private String address2_manfac;
	private String town_manfac;
	private String county_manfac;
	private String post_code_manfac;
	private String tel_manfac;
	private String contact_manfac;
	private String active_manfac;
	

	public Manufacturer() {                         //Created simple constructor
    }
	
    public String getId_manfac() {
		return id_manfac;
	}


	public void setId_manfac(String id_manfac) {
		this.id_manfac = id_manfac;
	}


	public String getName_manfac() {
		return name_manfac;
	}


	public void setName_manfac(String name_manfac) {
		this.name_manfac = name_manfac;
	}


	public String getAddress1_manfac() {
		return address1_manfac;
	}


	public void setAddress1_manfac(String address1_manfac) {
		this.address1_manfac = address1_manfac;
	}


	public String getAddress2_manfac() {
		return address2_manfac;
	}


	public void setAddress2_manfac(String address2_manfac) {
		this.address2_manfac = address2_manfac;
	}


	public String getTown_manfac() {
		return town_manfac;
	}


	public void setTown_manfac(String town_manfac) {
		this.town_manfac = town_manfac;
	}


	public String getCounty_manfac() {
		return county_manfac;
	}


	public void setCounty_manfac(String county_manfac) {
		this.county_manfac = county_manfac;
	}


	public String getPost_code_manfac() {
		return post_code_manfac;
	}


	public void setPost_code_manfac(String post_code_manfac) {
		this.post_code_manfac = post_code_manfac;
	}


	public String getTel_manfac() {
		return tel_manfac;
	}


	public void setTel_manfac(String tel_manfac) {
		this.tel_manfac = tel_manfac;
	}


	public String getContact_manfac() {
		return contact_manfac;
	}


	public void setContact_manfac(String contact_manfac) {
		this.contact_manfac = contact_manfac;
	}


	public String getActive_manfac() {
		return active_manfac;
	}


	public void setActive_manfac(String active_manfac) {
		this.active_manfac = active_manfac;
	}


	public Manufacturer(String id_manfac, String name_manfac, String address1_manfac, String address2_manfac,
			String town_manfac, String county_manfac, String post_code_manfac, String tel_manfac, String contact_manfac,
			String active_manfac) {
		super();
		this.id_manfac = id_manfac;
		this.name_manfac = name_manfac;
		this.address1_manfac = address1_manfac;
		this.address2_manfac = address2_manfac;
		this.town_manfac = town_manfac;
		this.county_manfac = county_manfac;
		this.post_code_manfac = post_code_manfac;
		this.tel_manfac = tel_manfac;
		this.contact_manfac = contact_manfac;
		this.active_manfac = active_manfac;
	}


	 @Override
	    public String toString() {
	        return "ManufacturerDto{" +
	        		"id_manfac='" + id_manfac + '\'' +
	                "name_manfac='" + name_manfac + '\'' +
	                ", address1_manfac='" + address1_manfac + '\'' +
	                ", address2_manfac='" + address2_manfac + '\'' +
	                ", town_manfac='" + town_manfac + '\'' +
	                ", county_manfac='" + county_manfac + '\'' +
	                ", post_code_manfac='" + post_code_manfac + '\'' +
	                ", tel_manfac='" + tel_manfac + '\'' +
	                ", contact_manfac='" + contact_manfac + '\'' +
	                ", active_manfac='" + active_manfac + '\'' +
	                	                
	                '}';
	    }
    
}   