package com.jlr.cid.admin.maintenance.categories.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	private String id_pk;
	private String description;
	private String reminder_period;
	private String active_yn;
	

    public Category() {                         //Created simple constructor
    }


	public Category(String id_pk, String description, String reminder_period, String active_yn) {
		super();
		this.id_pk = id_pk;
		this.description = description;
		this.reminder_period = reminder_period;
		this.active_yn = active_yn;
	}


	public String getId_pk() {
		return id_pk;
	}


	public void setId_pk(String id_pk) {
		this.id_pk = id_pk;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getReminder_period() {
		return reminder_period;
	}


	public void setReminder_period(String reminder_period) {
		this.reminder_period = reminder_period;
	}


	public String getActive_yn() {
		return active_yn;
	}


	public void setActive_yn(String active_yn) {
		this.active_yn = active_yn;
	}
    
	  @Override
	    public String toString() {
	        return "CategoryDto{" +
	                "id_pk='" + id_pk + '\'' +
	                ", description='" + description + '\'' +
	                ", reminder_period='" + reminder_period + '\'' +
	                ", active_yn='" + active_yn + '\'' +
	                	                
	                '}';
	    }
}
