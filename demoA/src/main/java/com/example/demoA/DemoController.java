package com.example.demoA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
public class DemoController {
	private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

	private final RestOperations restOperations;

	public DemoController(RestTemplateBuilder builder) {
		this.restOperations = builder.build();
	}

	@RequestMapping("/")
	public Message get() {
		LOG.info("Hello demo A");
		return restOperations.getForObject("http://demo-b:8080/", Message.class);
	}
}
