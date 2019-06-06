/*package com.project.project.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "response", schema = "contactcenter")
public class Response implements Serializable{
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_response", nullable=false, updatable=false)
    private int id_response;
    @NotNull
    @Column(name = "response_date")
    private Date response_date;
    @Column(name = "message")
    private String message;


    protected Response(){}

    public Response(@NotNull String message) {
        this.message = message;
    }

    public Long getIdResponse() {
        return id_response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage (String attachment_url) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id_response=" + id_response +
                ", response_date='" + response_date + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

*/
