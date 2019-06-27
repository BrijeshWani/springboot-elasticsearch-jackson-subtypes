package springboot.jackson.elasticsearch.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import springboot.jackson.elasticsearch.constants.VehicleType;

@Document(indexName = "vehicle", type = "_all", createIndex = true)
@Setting(settingPath = "/settings/vehicle_index.json")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({ @Type(value = Car.class, name = "car"), @Type(value = Bike.class, name = "bike") })
public abstract class Vehicle {

	@Id
	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private VehicleType type;

	@JsonProperty("number_of_tyres")
	private Integer numberOfTyres;

	public Vehicle(final VehicleType type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public VehicleType getType() {
		return type;
	}

	public Integer getNumberOfTyres() {
		return numberOfTyres;
	}

	public void setNumberOfTyres(final Integer numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}

}
