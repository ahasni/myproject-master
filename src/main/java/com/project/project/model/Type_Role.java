package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Type_Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role", nullable=false, updatable=false)
    private int id_role;

    @NotNull
    @Column(name = "role_name")
    private String role_name;

    protected Type_Role() {

    }

    @OneToMany(
        targetEntity=User.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "type_role")
    private Set<User> users = new HashSet<>();

    public Type_Role(String role_name){
        this.role_name = role_name;
    }

    public int getIdRole() {
        return id_role;
    }

    public void setIdRole(int id_role) {
        this.id_role = id_role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
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
                "id_role=" + id_role +
                ", role_name=" + role_name +
                 '\'' +
                '}';
    }
}

