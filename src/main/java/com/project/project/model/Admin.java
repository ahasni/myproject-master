/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdmin;
    @NotNull

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Admin")
    private Set<Survey> statt = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Admin")
    private Set<News> staat = new HashSet<>();

    protected Admin(){}


    @Override
    public String toString() {
        return "Attachment{" +
                "idAttachment=" + idAdmin +
                '}';
    }
}
*/