package com.example.demoC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/")
	public Message get() throws InterruptedException {
		LOG.info("Hello demo C");
		if (Math.random() > 0.9) {
			Thread.sleep(3000);
		}
		return new Message("Hello world!");
	}
}
