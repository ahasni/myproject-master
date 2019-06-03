package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "attachment")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAttachment;
    @NotNull
    @Column(name = "attachmenturl")
    private String attachmentURL;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Attachment")
    private Set<News> statt = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "Attachment")
    private Set<Request> getStattt = new HashSet<>();

    protected Attachment(){}

    public Attachment(@NotNull String attachmentURL) {
        this.attachmentURL = attachmentURL;
    }

    public Long getIdAttachment() {
        return idAttachment;
    }

    public String getAttachmentURL() {
        return attachmentURL;
    }

    public void setAttachmentURL(String attachmentURL) {
        this.attachmentURL = attachmentURL;
    }

    @Override
    public String toString() {
        return "Attachment{" +
            "idAttachment=" + idAttachment +
            ", attachmentURL='" + attachmentURL + '\'' +
            '}';
    }
}
