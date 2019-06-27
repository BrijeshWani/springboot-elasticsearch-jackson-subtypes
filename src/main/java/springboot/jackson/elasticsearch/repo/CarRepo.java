package springboot.jackson.elasticsearch.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import springboot.jackson.elasticsearch.entity.Car;

@Repository
public interface CarRepo extends ElasticsearchRepository<Car, String> {

}
