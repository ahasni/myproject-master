package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue
    private Long idNews;
    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @Column(name = "newsdescription")
    private String newsDescription;
    @Column(name = "publishingdate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private Date publishingDate;

    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "idAttachment", nullable = false)
    private Attachment attachment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAdmin", nullable = false)
    private Admin admin;

    protected News (){}


    public News(@NotNull String title, @NotNull String newsDescription, Date publishingDate) {
        this.title = title;
        this.newsDescription = newsDescription;
        this.publishingDate = publishingDate;
    }

    public Long getIdNews() {
        return idNews;
    }

    public void setIdNews(Long idNews) {
        this.idNews = idNews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "News{" +
            "idNews=" + idNews +
            ", title='" + title + '\'' +
            ", newsDescription='" + newsDescription + '\'' +
            ", publishingDate=" + publishingDate +
            '}';
    }
}
