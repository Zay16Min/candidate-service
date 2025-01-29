package com.vinsguru.candidateservice.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Candidate {
	@Id
	private String id;
	private String name;
	private Set<String> skills;

}
