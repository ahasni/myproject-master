package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFeedback;
    @NotNull
    @Column(name = "feedbackobject")
    private String feedbackObject;
    @NotNull
    @Column(name = "feedbackdescription")
    private String feedbackDescription;
    @Column(name = "feedbackdate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date feedbackDate;
    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    protected Feedback () { }

    public Feedback(@NotNull String feedbackObject, @NotNull String feedbackDescription, Date feedbackDate) {
        this.feedbackObject = feedbackObject;
        this.feedbackDescription = feedbackDescription;
        this.feedbackDate = feedbackDate;
    }

    public Long getIdFeedback() {
        return idFeedback;
    }

    public void setIdFeedback(Long idFeedback) {
        this.idFeedback = idFeedback;
    }

    public String getFeedbackObject() {
        return feedbackObject;
    }

    public void setFeedbackObject(String feedbackObject) {
        this.feedbackObject = feedbackObject;
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
            "idFeedback=" + idFeedback +
            ", feedbackObject='" + feedbackObject + '\'' +
            ", feedbackDescription='" + feedbackDescription + '\'' +
            ", feedbackDate=" + feedbackDate +
            '}';
    }
}
