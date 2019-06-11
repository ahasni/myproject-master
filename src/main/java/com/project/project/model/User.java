package com.project.project.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS", schema = "contactcenter")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user", nullable=false, updatable=false)
    private int id_user;

    @NotNull
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @Column(name = "last_name")
    private String last_name;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Column(name = "phone_number")
    private Long phone_number;

    @NotNull
    @Column(name = "photo")
    private String photo;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender",length = 10)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name="id_role",
        referencedColumnName = "id_role",
        insertable = false,
        updatable = false)

    private Type_Role type_role;

    @OneToMany(
            targetEntity=Admin.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user")
    private Set<Admin> admins = new HashSet<Admin>();
/*
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Feedback")
    private Set<Feedback> stat= new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Document")
    private Set<Document> stattt = new HashSet<>();*/

    public User() {
    }

    public User(String first_name, String last_name, String email, String password, String address, Long phone_number, String photo, Gender gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone_number = phone_number;
        this.photo = photo;
        this.gender = gender;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Set<Admin> admins) {
        this.admins = admins;
    }

    @Override
    public String toString() {
        return "User{" +
            "id_user=" + id_user +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", address='" + address + '\'' +
            ", phone_number=" + phone_number +
            ", photo='" + photo + '\'' +
            ", gender='" + gender + '\'' +
            '}';
    }
}
