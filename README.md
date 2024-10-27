# 📰 Latest Tech News Application

A simple web application to fetch and display the latest tech news articles using a public news API. This application allows users to view news articles with relevant details, such as title, description, author, and publication date. Users can also read the full article by following the provided links.

✨ Features
Fetch and display the latest tech news articles.
View article details including title, description, author, published date, and source.
Read the full article by clicking on the links.

🛠 Tech Stack
Backend: Java, Spring Boot
Frontend: Thymeleaf, HTML, CSS (Bootstrap)
APIs: News API for fetching articles

📥 Installation
To set up this project locally, follow these steps:

Clone the repository:

git clone https://github.com/yourusername/latest-tech-news.git
cd latest-tech-news
Ensure you have Java (JDK 11 or later) and Maven installed.

Configure the application properties:

Navigate to src/main/resources/application.properties and set the following: properties

news.api.url=YOUR_NEWS_API_URL
news.api.key=YOUR_NEWS_API_KEY
