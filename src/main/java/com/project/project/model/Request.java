/*package com.project.project.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "request", schema = "contactcenter")
public class Request implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_request", nullable=false, updatable=false)
    private int id_request;
    @NotNull
    @Column(name = "request_object")
    @Size(max = 200)
    private String request_object;
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date start_date;
    @NotNull
    @Column(name = "finish_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyy")
    private Date finish_date;

    @OneToMany(fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name = "id_attachment", nullable = false)
    private Attachment attachment;
    protected Request () {}
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_response", nullable = false)
    private Response response;

    public Request(String request_object, Date start_date, Date finish_date) {
        this.request_object = request_object;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    public int getIdRequest() {
        return id_request;
    }

    public void setIdRequest(int id_request) {
        this.id_request = id_request;
    }

    public String getRequestObject() {
        return request_object;
    }

    public void setRequestObject(String request_object) {
        this.request_object = request_object;
    }

    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
        this.start_date = start_date;
    }

    public Date getFinishDate() {
        return finish_date;
    }

    public void setFinishDate(Date finish_date) {
        this.finish_date = finish_date;
    }

    @Override
    public String toString() {
        return "Request{" +
            "id_request=" + id_request +
            ", request_object='" + request_object + '\'' +
            ", start_date=" + start_date +
            ", finish_date=" + finish_date +
            '}';
    }
}
*/
