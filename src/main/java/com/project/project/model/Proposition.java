/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "proposition", schema = "contactcenter")
public class Proposition implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proposition", nullable=false, updatable=false)
    private int id_proposition;

    @NotNull
    @Column(name = "text")
    private String text;
    @NotNull
    @Column(name = "count")
    private int count;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "id_survey", nullable = false)
    private Survey survey;


    protected Proposition (){}

    public Proposition(@NotNull String text, @NotNull int count) {
        this.text = text;
        this.count = count;
    }

    public int getIdProposition() {
        return id_proposition;
    }

    public void setIdProposition(int id_proposition) {
        this.id_proposition = id_proposition;
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
            "id_proposition=" + id_proposition +
            ", text='" + text + '\'' +
            ", count=" + count +
            '}';
    }
}
*/
