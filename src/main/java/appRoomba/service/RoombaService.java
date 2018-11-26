package appRoomba.service;

import appRoomba.model.Roomba;
import appRoomba.model.WalkPlanning;

public interface RoombaService {

	public Roomba run(WalkPlanning planning);
}
