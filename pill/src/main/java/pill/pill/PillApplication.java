package pill.pill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"web"})
public class PillApplication {

	public static void main(String[] args) {
		SpringApplication.run(PillApplication.class, args);
	}

}
