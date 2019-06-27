package springboot.jackson.elasticsearch.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import com.fasterxml.jackson.annotation.JsonProperty;

import springboot.jackson.elasticsearch.constants.VehicleType;

@Document(indexName = "vehicle", type = "car", createIndex = true)
@Mapping(mappingPath = "/mappings/car-mappings.json")
public class Car extends Vehicle {

	@JsonProperty("name")
	private String name;

	public Car(final VehicleType type) {
		super(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
