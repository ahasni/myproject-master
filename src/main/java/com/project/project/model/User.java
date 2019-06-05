package com.project.project.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    @NotNull
    @Size(max = 65)
    @Column(name = "firstname")
    private String firstName;

    @NotNull
    @Size(max = 65)
    @Column(name = "lastname")
    private String lastName;

    @NotNull
    @Email
    @Size(max = 50)
    @Column(name = "email")
    private String email;

    @NotNull
    @Size(max = 25)
    @Column(name = "password")
    private String password;

    @NotNull
    @Size(max = 125)
    @Column(name = "address")
    private String address;

    @NotNull
    @Size(max = 15)
    @Column(name = "phonenumber")
    private Long phoneNumber;

    @NotNull
    @Column(name = "photo")
    private String photo;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender",length = 10)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name="idRole",
        referencedColumnName = "idRole",
        insertable = false,
        updatable = false)
    private Type_Role type_role;

    /*@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Admin")
    private Set<Admin> statt = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Feedback")
    private Set<Feedback> stat= new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Document")
    private Set<Document> stattt = new HashSet<>();*/

    public User(Long idUser, Gender gender, Long phoneNumber, String photo, String password, String email, String firstName, String lastName, String address) {}

    public User(@NotNull @Size(max = 65) String firstName, @NotNull @Size(max = 65) String lastName, @NotNull @Email @Size(max = 50) String email, @NotNull @Size(max = 25) String password, @NotNull @Size(max = 125) String address, @NotNull @Size(max = 15) Long phoneNumber, @NotNull String photo, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.gender = gender;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    @Override
    public String toString() {
        return "User{" +
            "idUser=" + idUser +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", address='" + address + '\'' +
            ", phoneNumber=" + phoneNumber +
            ", photo='" + photo + '\'' +
            ", gender='" + gender + '\'' +
            '}';
    }
}
