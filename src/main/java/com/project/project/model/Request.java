package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRequest;
    @NotNull
    @Column(name = "requestobject")
    @Size(max = 200)
    private String requestObject;
    @NotNull
    @Column(name = "startdate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date startDate;
    @NotNull
    @Column(name = "finishdate")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date finishDate;
    @OneToMany(fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name = "idAttachment", nullable = false)
    private Attachment attachment;
    protected Request () {}

    public Request(String requestObject, Date startDate, Date finishDate) {
        this.requestObject = requestObject;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public Long getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Long idRequest) {
        this.idRequest = idRequest;
    }

    public String getRequestObject() {
        return requestObject;
    }

    public void setRequestObject(String requestObject) {
        this.requestObject = requestObject;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "Request{" +
            "idRequest=" + idRequest +
            ", requestObject='" + requestObject + '\'' +
            ", startDate=" + startDate +
            ", finishDate=" + finishDate +
            '}';
    }
}
