package com.project.project.repository;

import com.project.project.model.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends CrudRepository <Document, Long> {
}
