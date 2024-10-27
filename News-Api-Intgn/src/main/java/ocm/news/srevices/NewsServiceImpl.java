package ocm.news.srevices;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.java.Log;
import ocm.news.config.NewsApiConfig;
import ocm.news.consts.Consts;
import ocm.news.dto.NewsResponse;
import ocm.news.models.NewsDto;
import ocm.news.models.Source;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private NewsApiConfig newsApiConfig;
	
	@Override
	public List<NewsDto> getArticles() {
		String fetch_data_url = String.format(Consts.API_URL,newsApiConfig.getApiUrl() ,newsApiConfig.getApiKey());
		
		NewsResponse newsResponse = restTemplate.getForObject(fetch_data_url,NewsResponse.class);
		
		return newsResponse.getArticles().stream().map(article -> 	
		{
			NewsDto newsDto = new NewsDto();
			newsDto.setTitle(article.getTitle());
			newsDto.setAuthor(article.getAuthor());
			newsDto.setDescription(article.getDescription());
			newsDto.setUrl(article.getUrl());
			newsDto.setUrlToImage(article.getUrlToImage());
			newsDto.setPublishedAt(article.getPublishedAt());
				
			return newsDto;
		}).collect(Collectors.toList());
	}

	@Override
	public NewsDto getNewsByUrl(String url) {
		  try {
			NewsDto article = restTemplate.getForObject(url,NewsDto.class);
			
			NewsDto newsDto = new NewsDto();
			Optional.ofNullable(article).ifPresent(a -> 
			{
				newsDto.setAuthor(a.getAuthor());
				newsDto.setDescription(a.getDescription());
				newsDto.setContent(a.getContent());
				newsDto.setTitle(a.getTitle());
				newsDto.setUrl(a.getUrl());
				newsDto.setUrlToImage(a.getUrlToImage());
				newsDto.setPublishedAt(a.getPublishedAt());
				if(a.getSource() != null) 
				{
					Source source = new Source();
					source.setId(a.getSource().getId());
					source.setName(a.getSource().getName());
					newsDto.setSource(source);
				}
			});
			
			 return newsDto;
		} catch (Exception e) {
			System.out.println("Errot fetching data : " + e.getMessage() + url);
			return new NewsDto();
		}
	}
}
