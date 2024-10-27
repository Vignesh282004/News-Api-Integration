package ocm.news.models;

import lombok.Data;

@Data
public class NewsDto {
	
	private Source source;
	private String author;
	private String title;
	private String description;
	private String url;
	private String urlToImage;
	private String publishedAt;
	private String content;
}
