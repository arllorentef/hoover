package appRoomba.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plans")
public class WalkPlanningDTO {
	
	private List<Integer> roomSize;
	private List<Integer> coords;
	private List<List<Integer>> patches;
	private String instructions;
		
	public WalkPlanningDTO() {
		super();
	}
	public WalkPlanningDTO(List<Integer> roomSize, List<Integer> coords, List<List<Integer>> patches, String instructions) {
		super();
		this.roomSize = roomSize;
		this.coords = coords;
		this.patches = patches;
		this.instructions = instructions;
	}
	public List<Integer> getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(List<Integer> roomSize) {
		this.roomSize = roomSize;
	}
	public List<Integer> getCoords() {
		return coords;
	}
	public void setCoords(List<Integer> coords) {
		this.coords = coords;
	}
	public List<List<Integer>> getPatches() {
		return patches;
	}
	public void setPatches(List<List<Integer>> patches) {
		this.patches = patches;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
}
