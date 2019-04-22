package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSurvey;

    @NotNull
    @Column(name = "creationdate")
    private Date creationDate;
    @NotNull
    @Column(name = "closingdate")
    private Date closingDate;
    @NotNull
    @Column(name = "question")
    @Size(max = 300)
    private String question;
    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "idUser", nullable = false)
    private  Admin admin;
    protected Survey () {}

    public Survey(Date creationDate, Date closingDate, String question) {
        this.creationDate = creationDate;
        this.closingDate = closingDate;
        this.question = question;
    }

    public Long getIdSurvey() {
        return idSurvey;
    }

    public void setIdSurvey(Long idSurvey) {
        this.idSurvey = idSurvey;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Survey{" +
            "idSurvey=" + idSurvey +
            ", creationDate=" + creationDate +
            ", closingDate=" + closingDate +
            ", question='" + question + '\'' +
            '}';
    }
}
