package com.project.project.repository;

import com.project.project.model.Feedback;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
