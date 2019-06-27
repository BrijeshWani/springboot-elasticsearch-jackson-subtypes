package springboot.jackson.elasticsearch.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import springboot.jackson.elasticsearch.entity.Bike;

@Repository
public interface BikeRepo extends ElasticsearchRepository<Bike, String> {

}
