/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "admin", schema = "contactcenter")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_admin", nullable=false, updatable=false)
    private int id_admin;
    @NotNull

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
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
                "id_attachment=" + id_admin +
                '}';
    }
}
*/
