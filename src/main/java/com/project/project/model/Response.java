package com.project.project.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "response")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idResponse;
    @NotNull
    @Column(name = "responseDate")
    private Date responseDate;
    @Column(name = "message")
    private String message;


    protected Response(){}

    public Response(@NotNull String message) {
        this.message = message;
    }

    public Long getIdResponse() {
        return idResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage (String attachmentURL) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "idResponse=" + idResponse +
                ", responseDate='" + responseDate + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

