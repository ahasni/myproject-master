/* package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "news", schema = "contactcenter")
public class News implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_news", nullable=false, updatable=false)
    private int id_news;
    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @Column(name = "news_description")
    private String news_description;
    @Column(name = "publishing_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private Date publishing_date;

    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "id_attachment", nullable = false)
    private Attachment attachment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admin", nullable = false)
    private Admin admin;

    protected News (){}


    public News(@NotNull String title, @NotNull String newsDescription, Date publishingDate) {
        this.title = title;
        this.news_description = news_description;
        this.publishing_date = publishing_date;
    }

    public int getIdNews() {
        return id_news;
    }

    public void setIdNews(int id_news) {
        this.id_news = id_news;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsDescription() {
        return news_description;
    }

    public void setNewsDescription(String news_description) {
        this.news_description = news_description;
    }

    public Date getPublishingDate() {
        return publishing_date;
    }

    public void setPublishingDate(Date publishing_date) {
        this.publishing_date = publishing_date;
    }

    @Override
    public String toString() {
        return "News{" +
            "id_news=" + id_news +
            ", title='" + title + '\'' +
            ", news_description='" + news_description + '\'' +
            ", publishing_date=" + publishing_date +
            '}';
    }
}
 */
