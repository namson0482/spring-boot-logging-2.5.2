package vn.son.customizing.logback;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vu Nam Son
 *
 */
@RestController
@RequestMapping("/genlogs")
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@GetMapping
	public void generateLogs(@RequestParam(name = "lines", defaultValue = "3000") String linesArg) {

		final long lines = Long.parseLong(linesArg);
		for (int i = 0; i < lines; i++) {
			final Random rnd = new Random();
			final long l1 = rnd.nextLong();
			final long l2 = rnd.nextLong();

			logger.info("The number {} times {} is equal to {}", l1, l2, l1 * l2);
		}
	}
	
	@GetMapping(value = "/logs")
	public void logs(@RequestParam(name = "lines", defaultValue = "1000") String linesArg) {

		final long lines = Long.parseLong(linesArg);
		for (int i = 0; i < lines; i++) {
			final Random rnd = new Random();
			final long l1 = rnd.nextLong();
			final long l2 = rnd.nextLong();

			logger.info("The number {} times {} is equal to {}", l1, l2, l1 * l2);
		}
	}
	
}
