package com.vinsguru.candidateservice.dto;

import java.util.Set;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName= "create")
public class CandidateDto {
	
	private String id;
	private String name;
	private Set<String> skills;
}
