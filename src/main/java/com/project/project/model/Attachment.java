package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "attachment")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAttachment;
    @NotNull
    @Column(name = "attachmenturl")
    private String attachmentURL;

    protected Attachment(){}

    public Attachment(@NotNull String attachmentURL) {
        this.attachmentURL = attachmentURL;
    }

    public Long getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Long idAttachment) {
        this.idAttachment = idAttachment;
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
