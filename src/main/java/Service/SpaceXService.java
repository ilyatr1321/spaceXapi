package Service;

import DTO.SpaceXDTO;
import Entity.SpaceXCapsules;
import Repository.SpaceXRepositoryInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class SpaceXService {

    private final SpaceXRepositoryInterface spaceXRepository;

    private List<SpaceXCapsules> capsulesList;

    public void save(List<SpaceXCapsules> spaceXCapsules){
        spaceXRepository.saveAll(spaceXCapsules);
    }


    public SpaceXCapsules create(SpaceXDTO spaceXDTO){
        SpaceXCapsules capsules = SpaceXCapsules.builder()
                .capsule_id(spaceXDTO.getCapsule_id())
                .capsule_serial(spaceXDTO.getCapsule_serial())
                .build();
        return spaceXRepository.save(capsules);
    }

    public List<SpaceXCapsules> readAll(){
        return spaceXRepository.findAll();
    }

    public SpaceXCapsules update(SpaceXCapsules spaceXCapsules){
        return spaceXRepository.save(spaceXCapsules);
    }

    public void delete(String capsule_id) {
        spaceXRepository.deleteById(capsule_id);
    }




}
