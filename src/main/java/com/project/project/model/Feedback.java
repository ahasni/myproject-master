/*package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "feedback", schema = "contactcenter")
public class Feedback implements Serializable {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_feedback", nullable=false, updatable=false)
    private int id_feedback;

    @NotNull
    @Column(name = "feedback_object")
    private String feedback_object;

    @NotNull
    @Column(name = "feedback_description")
    private String feedback_description;

    @Column(name = "feedback_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date feedback_date;

    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.LAZY )
    @JoinColumn(name = "id_response", nullable = false)
    private Response response;

    protected Feedback () { }

    public Feedback(@NotNull String feedback_object, @NotNull String feedback_description, Date feedback_date) {
        this.feedback_object = feedback_object;
        this.feedback_description = feedback_description;
        this.feedback_date = feedback_date;
    }

    public int getIdFeedback() {
        return id_feedback;
    }

    public void setIdFeedback(int id_feedback) {
        this.id_feedback = id_feedback;
    }

    public String getFeedbackObject() {
        return feedback_object;
    }

    public void setFeedbackObject(String feedback_object) {
        this.feedback_object = feedback_object;
    }

    public String getFeedbackDescription() {
        return feedback_description;
    }

    public void setFeedbackDescription(String feedback_description) {
        this.feedback_description = feedback_description;
    }

    public Date getFeedbackDate() {
        return feedback_date;
    }

    public void setFeedbackDate(Date feedback_date) {
        this.feedback_date = feedback_date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
            "id_feedback=" + id_feedback +
            ", feedback_object='" + feedback_object + '\'' +
            ", feedback_description='" + feedback_description + '\'' +
            ", feedback_date=" + feedback_date +
            '}';
    }
}
*/
