package com.jlr.cid.admin.maintenance.news.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jlr.cid.admin.maintenance.news.dto.News;
import com.jlr.cid.admin.maintenance.news.service.NewsService;

@RestController
public class NewsController {
Logger logger = org.slf4j.LoggerFactory.getLogger(NewsController.class);
    
	@Autowired
	NewsService newsService;


	@GetMapping("/admin/maintenance/news/{id}")                                     //request for specific category id
	EntityModel<Optional<News>> getNews(@PathVariable String id) throws Exception {
		logger.info("NewsController....");
		Optional<News> news = newsService.getNews(id);
		return EntityModel.of(news, linkTo(methodOn(NewsController.class).getNews(id)).withSelfRel(),
				linkTo(methodOn(NewsController.class).getNewsAll()).withRel("/admin/maintenance/news"));
	}

	@RequestMapping("/admin/maintenance/news")                                     //request for categories
	public List<News> getNewsAll() throws Exception {
		logger.info("NewsController");
		return newsService.getNewsAll();
		
	}

}
