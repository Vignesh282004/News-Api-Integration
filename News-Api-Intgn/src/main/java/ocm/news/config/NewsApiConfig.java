package ocm.news.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@Data
public class NewsApiConfig {
		
	@Value("${news.api.key}")
	private String apiKey;
	
	@Value("${news.api.url}")
	private String apiUrl;
}
