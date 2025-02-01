package com.vinsguru.candidateservice.util;

import org.springframework.beans.BeanUtils;

import com.vinsguru.candidateservice.dto.CandidateDetailsDto;
import com.vinsguru.candidateservice.dto.CandidateDto;
import com.vinsguru.candidateservice.entity.Candidate;

public class EntityDtoUtil {
	
	public static CandidateDto toDto(Candidate candidate) {
		CandidateDto dto = new CandidateDto();
		BeanUtils.copyProperties(candidate, dto);
		return dto;
	}
	
	public static CandidateDetailsDto toDetailsDto(Candidate candidate) {
		CandidateDetailsDto dto = new CandidateDetailsDto();
		BeanUtils.copyProperties(candidate, dto);
		return dto;
	}
	
	public static Candidate toEntity(CandidateDto dto) {
		Candidate entity = new Candidate();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

}
