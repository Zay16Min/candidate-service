package com.vinsguru.candidateservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.vinsguru.candidateservice.entity.Candidate;

@Repository
public interface CandidateRepository extends ReactiveCrudRepository<Candidate, String>{

}
