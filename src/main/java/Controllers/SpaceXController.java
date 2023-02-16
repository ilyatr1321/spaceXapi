package Controllers;

import DTO.SpaceXDTO;
import Entity.SpaceXCapsules;
import Service.SpaceXService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class SpaceXController {

    private final SpaceXService spaceXService;


    @PostMapping
    public ResponseEntity<SpaceXCapsules> create(@RequestBody SpaceXDTO spaceXDTO){
        return new ResponseEntity<>(spaceXService.create(spaceXDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<SpaceXCapsules>> readAll(){
        return new ResponseEntity<>(spaceXService.readAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<SpaceXCapsules> update(@RequestBody SpaceXCapsules spaceXCapsules){
        return new ResponseEntity<>(spaceXService.update(spaceXCapsules), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable String capsule_id){
        spaceXService.delete(capsule_id);
        return HttpStatus.OK;
    }



    @GetMapping("/api/data")
    public List<SpaceXCapsules> getSpaceXCapsules() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://api.spacexdata.com/v3/capsules";
        SpaceXCapsules[] dataObjects = restTemplate.getForObject(apiUrl, SpaceXCapsules[].class);
        List<SpaceXCapsules> spaceXCapsulesList = new ArrayList<>();
        for (SpaceXCapsules spaceXCapsules : spaceXCapsulesList) {
            spaceXCapsulesList.add(spaceXCapsules);
        }
        return spaceXCapsulesList;
    }

    }



