package appRoomba.model;

public class Roomba {
	private Coordenates location;
	private Integer cleanedSpots;
	
	public Roomba(Coordenates location) {
		super();
		this.location = location;
		this.cleanedSpots = 0;
	}

	public Coordenates getLocation() {
		return location;
	}

	public void setLocation(Coordenates location) {
		this.location = location;
	}
	
	public Integer getCleanedSpots() {
		return cleanedSpots;
	}

	public void setCleanedSpots(Integer cleanedSpots) {
		this.cleanedSpots = cleanedSpots;
	}

	public void clean() {
		this.cleanedSpots++;
	}
}
