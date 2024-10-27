# 📰 Latest Tech News Application

A simple web application to fetch and display the latest tech news articles using a public news API. This application allows users to view news articles with relevant details, such as title, description, author, and publication date. Users can also read the full article by following the provided links.

## ✨ Features

- Fetch and display the latest tech news articles.
- View article details including title, description, author, published date, and source.
- Read the full article by clicking on the links.

## 🛠 Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS (Bootstrap)
- **APIs**: [News API](https://newsapi.org/) for fetching articles

## 📥 Installation

To set up this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/latest-tech-news.git
   cd latest-tech-news
   ```
   Ensure you have Java (JDK 11 or later) and Maven installed.

2. Configure the application properties:

    Navigate to `src/main/resources/application.properties` and set the following:
   `properties`
    ```
    news.api.url=YOUR_NEWS_API_URL
    news.api.key=YOUR_NEWS_API_KEY
    ```
4. Build the project:
    ```
    mvn clean install
    ```
5. Run the application:
    ```
    mvn spring-boot:run
    ```
6. Open your browser and go to `http://localhost:{YOUR PORT NUMBER}/news` to see the latest tech news articles.

## 🚀 Usage
  - Launch the application..
  - Browse through the latest tech news articles.
  - Click on the "Read More" button to view the full article.
## 📡 API Endpoints
  - Fetch Latest News Articles
    - Endpoint: `/news`
    - Method: `GET`
      Description: Fetches the latest tech news articles from the News API.
  - View Full Article
    - Endpoint: `/news/{url}`
    - Method: `GET`
      Description: Redirects to the full news article based on the provided URL.
## 🖼️ Screenshots
  Screenshot of the Latest Tech News Homepage
    
  ![Latest Tech News - localhost](https://github.com/user-attachments/assets/8270a7ac-ed80-4135-bf5f-13acd81009b4)

## 🤝 Contributing
  Contributions are welcome! If you want to contribute, please fork the repository and create a pull request.

 - Fork the project
    - Create your feature branch (git checkout -b feature/YourFeature)
    - Commit your changes (git commit -m 'Add some feature')
    - Push to the branch (git push origin feature/YourFeature)
    - Open a pull request

## 🙏 Acknowledgements
  - News API for providing the news data.
  - Bootstrap for styling.

  - Thank You....
