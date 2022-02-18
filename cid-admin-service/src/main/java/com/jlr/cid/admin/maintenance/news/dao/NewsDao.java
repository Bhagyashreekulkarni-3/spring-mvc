package com.jlr.cid.admin.maintenance.news.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlr.cid.admin.maintenance.news.dto.News;

public interface NewsDao extends JpaRepository<News,String>{

	List<News> getNewsAll() throws Exception;

	Optional<News> getNews(String id) throws Exception;

}
