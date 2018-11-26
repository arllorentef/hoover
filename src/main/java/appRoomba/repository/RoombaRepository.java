package appRoomba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import appRoomba.dto.WalkResultDTO;

@Repository
public interface RoombaRepository extends MongoRepository<WalkResultDTO, String> {

}
