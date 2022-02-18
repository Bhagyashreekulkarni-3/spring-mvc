package com.jlr.cid.admin.maintenance.locations.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	
	@Id
	private String name;
	private String address1;
	private String town;
	private String id_loc;
	private String address2;
	private String post_code;
	private String county;
	private String active_loc;
	

    public Location() {                         //Created simple constructor
    }

	
	
	public Location(String name, String address1, String town, String id_loc, String address2, String post_code,
			String county, String active_loc) {
		super();
		this.name = name;
		this.address1 = address1;
		this.town = town;
		this.id_loc = id_loc;
		this.address2 = address2;
		this.post_code = post_code;
		this.county = county;
		this.active_loc = active_loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getId_loc() {
		return id_loc;
	}
	public void setId_loc(String id_loc) {
		this.id_loc = id_loc;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPost_code() {
		return post_code;
	}
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getActive_loc() {
		return active_loc;
	}
	public void setActive_loc(String active_loc) {
		this.active_loc = active_loc;
	}
	
	 @Override
	    public String toString() {
	        return "LocationDto{" +
	                "name='" + name + '\'' +
	                ", address1='" + address1 + '\'' +
	                ", town='" + town + '\'' +
	                ", id_loc='" + id_loc + '\'' +
	                ", address2='" + address2 + '\'' +
	                ", post_code='" + post_code + '\'' +
	                ", county='" + county + '\'' +
	                ", active_yn='" + active_loc + '\'' +
	                	                
	                '}';
	    }

}
