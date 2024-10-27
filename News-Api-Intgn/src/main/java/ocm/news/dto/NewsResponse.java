package ocm.news.dto;

import java.util.List;

import lombok.Data;
import ocm.news.models.NewsDto;

@Data
public class NewsResponse {

	private String status;
	private int totalResults;
	private List<NewsDto> articles;
}
