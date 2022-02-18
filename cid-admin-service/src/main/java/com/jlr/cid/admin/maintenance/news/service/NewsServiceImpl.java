package com.jlr.cid.admin.maintenance.news.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlr.cid.admin.maintenance.news.dao.NewsDao;
import com.jlr.cid.admin.maintenance.news.dto.News;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsDao newsDao;
	
	@Override
	public List<News> getNewsAll() throws Exception {
		// TODO Auto-generated method stub
		return newsDao.getNewsAll();
	}

	@Override
	public Optional<News> getNews(String id) throws Exception {
		// TODO Auto-generated method stub
		return newsDao.getNews(id);
	}

}
