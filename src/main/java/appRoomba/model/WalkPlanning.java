package appRoomba.model;

import java.util.List;

public class WalkPlanning {

	private Coordenates roomba;
	
	private Size room;
	
	private List<Patch> patches;
	
	private String track;

	public Coordenates getRoomba() {
		return roomba;
	}

	public void setRoomba(Coordenates roomba) {
		this.roomba = roomba;
	}

	public Size getRoom() {
		return room;
	}

	public void setRoom(Size room) {
		this.room = room;
	}

	public List<Patch> getPatches() {
		return patches;
	}

	public void setPatches(List<Patch> patches) {
		this.patches = patches;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
}
