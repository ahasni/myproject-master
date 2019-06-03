package com.project.project.repository;


import com.project.project.model.Survey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface SurveyRepository extends CrudRepository<Survey, Long>{
}

