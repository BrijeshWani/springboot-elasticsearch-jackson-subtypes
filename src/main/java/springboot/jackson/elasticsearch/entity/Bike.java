package springboot.jackson.elasticsearch.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import com.fasterxml.jackson.annotation.JsonProperty;

import springboot.jackson.elasticsearch.constants.VehicleType;

@Document(indexName = "vehicle", type = "bike", createIndex = true)
@Mapping(mappingPath = "/mappings/bike-mappings.json")
public class Bike extends Vehicle {

	@JsonProperty("name")
	private String name;

	public Bike(final VehicleType type) {
		super(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
