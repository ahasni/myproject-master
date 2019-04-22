package com.project.project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDocument;
    @NotNull
    @Column(name = "documenturl")
    private String documentURL;
    @NotNull
    @Column(name = "documenttype")
    private String documentType;

    @OneToOne(fetch = FetchType.LAZY,optional = false )
    @JoinColumn(name = "idUser", nullable = false)
    private User user;
    
    protected Document(){}

    public Document(@NotNull String documentURL, @NotNull String documentType) {
        this.documentURL = documentURL;
        this.documentType = documentType;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public String getDocumentURL() {
        return documentURL;
    }

    public void setDocumentURL(String documentURL) {
        this.documentURL = documentURL;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Document{" +
            "idDocument=" + idDocument +
            ", documentURL='" + documentURL + '\'' +
            ", documentType='" + documentType + '\'' +
            '}';
    }
}
