/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "attachment", schema = "contactcenter")
public class Attachment implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_attachment", nullable=false, updatable=false)
    private int id_attachment;
    @NotNull
    @Column(name = "attachment_url")
    private String attachment_url;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Attachment")
    private Set<News> statt = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Attachment")
    private Set<Request> getStattt = new HashSet<>();

    protected Attachment(){}

    public Attachment(@NotNull String attachment_url) {
        this.attachment_url = attachment_url;
    }

    public int getIdAttachment() {
        return id_attachment;
    }

    public String getAttachmentUrl() {
        return attachment_url;
    }

    public void setAttachmentUrl(String attachment_url) {
        this.attachment_url = attachment_url;
    }

    @Override
    public String toString() {
        return "Attachment{" +
            "id_attachment=" + id_attachment +
            ", attachment_url='" + attachment_url + '\'' +
            '}';
    }
}
*/
