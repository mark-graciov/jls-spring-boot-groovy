package md.arobs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration

/**
 * Spring boot application magic
 * Autoconfigures a H2 database with REST, JPA and Spring Data capabilities
 *
 * Disables spring security autoconfiguration for now
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration)
class Combinator2Application {

    /**
     * Application entry point
     * @param args The args, you know 'em
     */
	static void main(String[] args) {
		SpringApplication.run(Combinator2Application, args)
	}
}
