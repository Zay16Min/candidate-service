package com.vinsguru.candidateservice.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CandidateDetailsDto extends CandidateDto {
	
	private List<JobDto> recommendedJobs;

}
