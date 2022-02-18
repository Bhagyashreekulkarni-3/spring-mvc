package com.jlr.cid.admin.maintenance.news.service;

import java.util.List;
import java.util.Optional;

import com.jlr.cid.admin.maintenance.news.dto.News;

public interface NewsService {

	

	List<News> getNewsAll() throws Exception;

	Optional<News> getNews(String id) throws Exception;

	

}
