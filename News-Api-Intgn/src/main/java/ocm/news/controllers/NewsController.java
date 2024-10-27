package ocm.news.controllers;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ocm.news.models.NewsDto;
import ocm.news.srevices.NewsServiceImpl;

@Controller
public class NewsController {
	
	@Autowired
	private NewsServiceImpl newsServiceImpl;
	
	@GetMapping("/news")
	public String getNews(Model model)  
	{
		List<NewsDto> newsDtos = newsServiceImpl.getArticles();
		model.addAttribute("news",newsDtos);
		return "news";
	}
	
	@GetMapping("/news/{url:.+}")
	public String getarticlebyurl(@PathVariable String url, Model model) 
	{
		String decodeUrl = URLDecoder.decode(url,StandardCharsets.UTF_8);
		NewsDto newsDto = newsServiceImpl.getNewsByUrl(decodeUrl);
		model.addAttribute("article",newsDto);
		return "full-news";
	}
}
