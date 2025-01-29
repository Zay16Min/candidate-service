package com.vinsguru.candidateservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinsguru.candidateservice.dto.CandidateDto;
import com.vinsguru.candidateservice.service.CandidateService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("candidate")
public class CandidateController {

	@Autowired
	private CandidateService service;
	
	@GetMapping("all")
	public Flux<CandidateDto> allCandidates() {
		return this.service.all();
	}
	
	@GetMapping("{id}")
	public Mono<CandidateDto> getById(@PathVariable String id) {
		return this.service.getById(id);
	}
	
	@PostMapping
	public Mono<CandidateDto> save(@RequestBody Mono<CandidateDto> mono) {
		return this.service.save(mono);
	}
}
