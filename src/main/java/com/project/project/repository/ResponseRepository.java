package com.project.project.repository;

import com.project.project.model.Response;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends CrudRepository <Response, Long> {
}

