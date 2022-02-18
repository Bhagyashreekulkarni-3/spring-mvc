package com.jlr.cid.admin.maintenance.news.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class News {
	
	@Id
	private String id_news;
	private String start_date;
	private String end_date;
	private String headline;
	private String summary;
	private String content;
	
	public News()
	{
		
	}
	
	public News(String id_news, String start_date, String end_date, String headline, String summary, String content) {
		super();
		this.id_news = id_news;
		this.start_date = start_date;
		this.end_date = end_date;
		this.headline = headline;
		this.summary = summary;
		this.content = content;
	}

	
	public String getId_news() {
		return id_news;
	}
	public void setId_news(String id_news) {
		this.id_news = id_news;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	 @Override
	    public String toString() {
	        return "NewsDto{" +
	        		"id_news='" + id_news + '\'' +
	                ",start_date='" + start_date + '\'' +
	                ",end_date ='" + end_date + '\'' +
	                ", headline='" + headline + '\'' +
	                ", summary='" + summary + '\'' +
	                ", content='" + content + '\'' +
	                
	                	                
	                '}';	

}
}
