package com.project.project.controller;
import com.project.project.model.News;
import com.project.project.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsController {
    @Autowired
    NewsRepository newsRepository;

    @GetMapping("/news")
    public List<News> retrieveAllNews() {
        return (List<News>) newsRepository.findAll();
    }

    @GetMapping("/news/{idNews")
    public News retrieveNews(@PathVariable long idUser) {
        Optional<News> news = newsRepository.findById(idUser);
        return news.get();
    }

    @DeleteMapping("/news/{idNews}")
    public void deleteNews(@PathVariable long idNews) {
        newsRepository.deleteById(idNews);
    }

    @PostMapping(value = "/news/create")
    public News postNews(@RequestBody News news) {
        News _news = newsRepository.save(new News(news.getTitle(),
                news.getNewsDescription(),
                news.getPublishingDate()));
        return _news;
    }
    @PutMapping("/News/{idNews}")
    public ResponseEntity<News> updateNews(@PathVariable("idNews") long idNews, @RequestBody News news) {
        Optional<News> newsData = newsRepository.findById(idNews);
        News _news = newsData.get();
        _news.setTitle(news.getTitle());
        _news.setNewsDescription(news.getNewsDescription());
        _news.setPublishingDate(news.getPublishingDate());
        return new ResponseEntity<>(newsRepository.save(_news), HttpStatus.OK);
    }
    }


