/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "proposition")
public class Proposition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProposition;

    @NotNull
    @Column(name = "text")
    private String text;
    @NotNull
    @Column(name = "count")
    private int count;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "idSurvey", nullable = false)
    private Survey survey;


    protected Proposition (){}

    public Proposition(@NotNull String text, @NotNull int count) {
        this.text = text;
        this.count = count;
    }

    public Long getIdProposition() {
        return idProposition;
    }

    public void setIdProposition(Long idProposition) {
        this.idProposition = idProposition;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Proposition{" +
            "idProposition=" + idProposition +
            ", text='" + text + '\'' +
            ", count=" + count +
            '}';
    }
}
*/