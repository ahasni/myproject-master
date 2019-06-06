/*package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "document", schema = "contactcenter")
public class Document implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_document", nullable=false, updatable=false)
    private int id_document;
    @NotNull
    @Column(name = "document_url")
    private String document_url;
    @NotNull
    @Column(name = "document_type")
    private String document_type;

    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    protected Document(){}

    public Document(@NotNull String document_url, @NotNull String document_type) {
        this.document_url = document_url;
        this.document_type = document_type;
    }

    public int getIdDocument() {
        return id_document;
    }

    public void setIdDocument(int id_document) {
        this.id_document = id_document;
    }

    public String getDocumentURL() {
        return document_url;
    }

    public void setDocumentURL(String document_url) {
        this.document_url = document_url;
    }

    public String getDocumentType() {
        return document_type;
    }

    public void setDocumentType(String document_type) {
        this.document_type = document_type;
    }

    @Override
    public String toString() {
        return "Document{" +
            "id_document=" + id_document +
            ", document_url='" + document_url + '\'' +
            ", document_type='" + document_type + '\'' +
            '}';
    }
}
*/
