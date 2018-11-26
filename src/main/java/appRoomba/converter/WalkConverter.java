package appRoomba.converter;

import java.util.ArrayList;
import java.util.List;

import appRoomba.dto.WalkResultDTO;
import appRoomba.model.Roomba;

public class WalkConverter {

	public static Roomba entityFromDto (WalkResultDTO dto) {
		//TODO 
		return null;
	}
	
	
	public static WalkResultDTO dtoFromEntity(Roomba entity) {
		WalkResultDTO dto = new WalkResultDTO();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(entity.getLocation().getX());
		list.add(entity.getLocation().getY());
		dto.setCoords(list);
		
		dto.setPatches(entity.getCleanedSpots());
		
		return dto;
	}
}
