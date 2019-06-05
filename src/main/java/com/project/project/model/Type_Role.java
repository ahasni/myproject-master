package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TYPE_ROLE")
public class Type_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRole;

    @NotNull
    @Column(name = "roleName")
    private String roleName;

    @OneToMany(
        targetEntity=User.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "type_role")
    private Set<User> users = new HashSet<>();

    Type_Role(String roleName){
        this.roleName = roleName;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    public Set<User> getUsersForRole() {
        return users;
    }

    public void setUsersForRole(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Type_Role{" +
                "idRole=" + idRole +
                ", roleName=" + roleName +
                 '\'' +
                '}';
    }
}

