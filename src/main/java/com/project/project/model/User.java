package com.project.project.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "User", schema = "contactcenter")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user", nullable=false, updatable=false)
    private int id_user;

    @NotNull
    @Size(max = 65)
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @Size(max = 65)
    @Column(name = "last_name")
    private String last_name;

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

    public User(Long id_user, Gender gender, Long phone_number, String photo, String password, String email, String first_name, String last_name, String address) {}

    public User(@NotNull @Size(max = 65) String first_name, @NotNull @Size(max = 65) String last_name, @NotNull @Email @Size(max = 50) String email, @NotNull @Size(max = 25) String password, @NotNull @Size(max = 125) String address, @NotNull @Size(max = 15) Long phone_number, @NotNull String photo, Gender gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone_number = phone_number;
        this.photo = photo;
        this.gender = gender;
    }

    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
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
        return phone_number;
    }

    public void setPhoneNumber(Long phoneNumber) {
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
