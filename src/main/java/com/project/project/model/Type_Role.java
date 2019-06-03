package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "type_role")
public class Type_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRole;

    @NotNull
    @Column(name = "roleName")
    private String rolename;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Type_Role")
    private Set<User> statt = new HashSet<>();



    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return rolename;
    }

    public void setRoleName(String roleName) {
        this.rolename = roleName;
    }

    @Override
    public String toString() {
        return "Type_Role{" +
                "idRole=" + idRole +
                ", roleName=" + rolename +
                 '\'' +
                '}';
    }
}

