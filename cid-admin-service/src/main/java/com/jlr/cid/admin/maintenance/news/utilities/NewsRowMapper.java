package com.jlr.cid.admin.maintenance.news.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jlr.cid.admin.maintenance.news.dto.News;

public class NewsRowMapper implements RowMapper<News> {

	public static News mapRow(ResultSet rs) throws SQLException {
	News news = new News();
    
	news.setId_news(rs.getString("id_pk"));
	news.setStart_date(rs.getString("start_date"));
	news.setEnd_date(rs.getString("end_date"));
	news.setHeadline(rs.getString("headline"));
	news.setSummary(rs.getString("summary"));
	news.setContent(rs.getString("content"));
	

	return news;
}

@Override
public News mapRow(ResultSet rs, int rowNum) throws SQLException {
	return null;
}

}
