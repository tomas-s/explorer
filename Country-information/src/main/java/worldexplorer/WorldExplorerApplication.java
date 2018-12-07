package worldexplorer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WorldExplorerApplication {

	private static final Logger log = LoggerFactory.getLogger(WorldExplorerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WorldExplorerApplication.class, args);
	}


}
