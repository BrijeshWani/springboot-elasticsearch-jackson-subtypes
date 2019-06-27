package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import springboot.jackson.elasticsearch.entity.Vehicle;
import springboot.jackson.elasticsearch.repo.BikeRepo;

@SpringBootApplication
@EnableAutoConfiguration
@EnableElasticsearchRepositories(basePackageClasses = { Vehicle.class, BikeRepo.class })
public class SpringbootClient {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootClient.class, args);
    }
}