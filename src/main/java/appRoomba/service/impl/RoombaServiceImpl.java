package appRoomba.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import appRoomba.model.Coordenates;
import appRoomba.model.Patch;
import appRoomba.model.Roomba;
import appRoomba.model.Size;
import appRoomba.model.WalkPlanning;
import appRoomba.service.RoombaService;

@Service
public class RoombaServiceImpl implements RoombaService{
	
	public Roomba run(WalkPlanning planning) {
		Roomba roomba = new Roomba(planning.getRoomba());
		List<Patch> patches = new ArrayList<Patch>(planning.getPatches());
		
		for(char direction: planning.getTrack().toCharArray()) {
			makeStep(roomba,direction,planning.getRoom() );
			cleanPatch(roomba,patches);
		}
		return roomba;
		
	}
	
	private void makeStep(Roomba roomba,char direction, Size rommSize) {
		Coordenates location = roomba.getLocation();
		switch (direction) {
			case 'N':
				location.setY(location.getY() < rommSize.getWidth() ?location.getY()+1:location.getY());
				break;
			case 'S':
				location.setY(location.getY() > 0 ?location.getY()-1:location.getY());
				break;
			case 'E':
				location.setX(location.getX() < rommSize.getHeight() ?location.getX()+1:location.getX()); 
				
				break;
			case 'W':
				location.setX(location.getX() > 0 ?location.getX()-1:location.getX());
				break;
			default:
				break;
		}
		
	}
	
	private void cleanPatch(Roomba roomba, List<Patch> patches) {
		Coordenates location = roomba.getLocation();
		
		if (patches.isEmpty()) {
			return;
		}
		
		for (Patch patch : patches) {
			if(location.sameSpot(patch.getCoods())){
				roomba.clean();
				patches.remove(patch);
				break;
			}
		}
	}
}
