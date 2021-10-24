package com.pablocastelnovo.posts.customizing.logback.spring.M5;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/genlogs")
@Slf4j
public class MainController {

//	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@GetMapping
	public void generateLogs(@RequestParam(name = "lines", defaultValue = "2000") String linesArg) {

		final long lines = Long.parseLong(linesArg);
		for (int i = 0; i < lines; i++) {
			final Random rnd = new Random();
			final long l1 = rnd.nextLong();
			final long l2 = rnd.nextLong();

			log.info("The number {} times {} is equal to {}", l1, l2, l1 * l2);
			log.debug("debug message {}", System.currentTimeMillis());
			log.trace("trace message {}", System.currentTimeMillis());
			log.warn("warn message {}", System.currentTimeMillis());
			log.error("error message {}", System.currentTimeMillis());
		}
	}

}
