package com.vinsguru.candidateservice;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.vinsguru.candidateservice.dto.CandidateDto;

@SpringBootTest
@AutoConfigureWebTestClient
class CandidateServiceIT extends BaseTest {

	@Autowired
	private WebTestClient client;

	@Test
	void allCandidatesTest() {
		this.client.get()
			.uri("/candidate/all")
			.exchange()
			.expectStatus().is2xxSuccessful()
			.expectBody()
			.jsonPath("$").isNotEmpty();
	}
	
	@Test
	void getCandidateByIdTest() {
		this.client.get()
			.uri("/candidate/1")
			.exchange()
			.expectStatus().is2xxSuccessful()
			.expectBody()
			.jsonPath("$.id").isEqualTo(1)
			.jsonPath("$.name").isEqualTo("sam");
	}
	
	@Test
	void postCandidateTest() {
		var dto = CandidateDto.create(null, "dr.dre", Set.of("k8s"));
		this.client.post()
			.uri("/candidate")
			.bodyValue(dto)
			.exchange()
			.expectStatus().is2xxSuccessful()
			.expectBody()
			.jsonPath("$.id").isNotEmpty()
			.jsonPath("$.name").isEqualTo("dr.dre");
				
	}
	
}
