package com.project.project.repository;

import com.project.project.model.Proposition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropositionRepository extends CrudRepository<Proposition, Long> {
}
