/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "survey", schema = "contactcenter")
public class Survey  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name="id_survey", nullable=false, updatable=false)
    private int id_survey;

    @NotNull
    @Column(name = "creation_date")
    private Date creation_date;
    @NotNull
    @Column(name = "closing_date")
    private Date closing_date;
    @NotNull
    @Column(name = "question")
    @Size(max = 300)
    private String question;

    @OneToMany(fetch = FetchType.LAZY )
    @JoinColumn(name = "id_user", nullable = false)
    private  Admin admin;


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Survey")
    private Set<Proposition> statt = new HashSet<>();

    protected Survey () {}

    public Survey(Date creation_date, Date closing_date, String question) {
        this.creation_date = creation_date;
        this.closing_date = closing_date;
        this.question = question;
    }

    public int getIdSurvey() {
        return id_survey;
    }

    public void setIdSurvey(int id_survey) {
        this.id_survey = id_survey;
    }

    public Date getCreationDate() {
        return creation_date;
    }

    public void setCreationDate(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getClosingDate() {
        return closing_date;
    }

    public void setClosingDate(Date closing_date) {
        this.closing_date = closing_date;
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
            "id_survey=" + id_survey +
            ", creation_date=" + creation_date +
            ", closing_date=" + closing_date +
            ", question='" + question + '\'' +
            '}';
    }
}
*/
