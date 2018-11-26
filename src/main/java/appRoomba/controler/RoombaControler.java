package appRoomba.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import appRoomba.converter.WalkConverter;
import appRoomba.converter.WalkPlanningConverter;
import appRoomba.dto.WalkPlanningDTO;
import appRoomba.dto.WalkResultDTO;
import appRoomba.model.Roomba;
import appRoomba.model.WalkPlanning;
import appRoomba.repository.PlansRepository;
import appRoomba.repository.RoombaRepository;
import appRoomba.service.RoombaService;


@Controller
public class RoombaControler {
	
@Autowired
public RoombaService service;
@Autowired
private RoombaRepository roombaRepository;
@Autowired
private PlansRepository plansRepository; 
	  
	@PostMapping(value = "/run")
	private ResponseEntity<WalkResultDTO> beginStroll(@RequestBody(required = true) WalkPlanningDTO walkPlanning) {
		plansRepository.save(walkPlanning);
		WalkPlanning planning = validate(walkPlanning);
		Roomba roomba= service.run(planning);
		WalkResultDTO response = WalkConverter.dtoFromEntity(roomba);
		roombaRepository.save(response);
		return new ResponseEntity<WalkResultDTO>(response,HttpStatus.OK);
	}
	
	private WalkPlanning validate (WalkPlanningDTO walkPlanning) {
		//TODO
		return WalkPlanningConverter.entityFromDto(walkPlanning);
	}
}
