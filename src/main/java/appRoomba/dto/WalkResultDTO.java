package appRoomba.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roombas")
public class WalkResultDTO {
	private List<Integer> coords;
	private Integer patches;
		
	public WalkResultDTO() {
		super();
	}

	public WalkResultDTO(List<Integer> coords, Integer patches) {
		super();
		this.coords = coords;
		this.patches = patches;
	}

	public List<Integer> getCoords() {
		return coords;
	}

	public void setCoords(List<Integer> coords) {
		this.coords = coords;
	}

	public Integer getPatches() {
		return patches;
	}

	public void setPatches(Integer patches) {
		this.patches = patches;
	}
	
}
