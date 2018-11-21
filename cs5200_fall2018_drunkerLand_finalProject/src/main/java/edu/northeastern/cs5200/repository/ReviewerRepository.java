package edu.northeastern.cs5200.repository;

import org.springframework.data.repository.CrudRepository;

import edu.northeastern.cs5200.models.Reviewer;



public interface ReviewerRepository extends CrudRepository<Reviewer, Integer>{

}
