package appRoomba.converter;

import java.util.ArrayList;
import java.util.List;

import appRoomba.dto.WalkPlanningDTO;
import appRoomba.model.Coordenates;
import appRoomba.model.Patch;
import appRoomba.model.Size;
import appRoomba.model.WalkPlanning;

public class WalkPlanningConverter {

	public static WalkPlanning entityFromDto (WalkPlanningDTO dto) {
		WalkPlanning entity = new WalkPlanning();
		
		List<Integer> size = dto.getRoomSize();
		Size room = new Size(size.get(0),size.get(1));
		entity.setRoom(room);
		
		List<Integer> coords = dto.getCoords();
		coords = dto.getCoords();
		Coordenates roomba = new Coordenates(coords.get(0),coords.get(1));
		entity.setRoomba(roomba);
		
		entity.setTrack(dto.getInstructions());
		
		List<Patch> patches = new ArrayList<Patch>();
		for (List<Integer> patch: dto.getPatches()) {
			patches.add(new Patch(patch.get(0),patch.get(1)));
		}
		entity.setPatches(patches);
		return entity;	
	}
	
	
	public static WalkPlanningDTO dtoFromEntity (WalkPlanning entity) {
		//TODO 
		return null;
	}
}
