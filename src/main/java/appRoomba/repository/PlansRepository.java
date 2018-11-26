package appRoomba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import appRoomba.dto.WalkPlanningDTO;

@Repository
public interface PlansRepository extends MongoRepository<WalkPlanningDTO, String> {

}
