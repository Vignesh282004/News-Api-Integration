package ocm.news.srevices;

import java.util.List;

import ocm.news.models.NewsDto;

public interface NewsService {
	
	List<NewsDto> getArticles();
	NewsDto getNewsByUrl(String url);
}
