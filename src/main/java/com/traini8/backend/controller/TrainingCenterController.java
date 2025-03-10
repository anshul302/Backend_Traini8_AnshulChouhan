package com.traini8.backend.controller;

import com.traini8.backend.dto.TrainingCenterDTO;
import com.traini8.backend.entity.TrainingCenter;
import com.traini8.backend.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/api/training_center")
@Validated
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    // API to create a new Training center

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenterDTO centerDTO ){
        TrainingCenter center=mapDtoToEntity(centerDTO);
        TrainingCenter savedCenter=service.createTrainingCenter(center);
        return ResponseEntity.ok(savedCenter);

    }

    // API to get Training Centres

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            @RequestParam Optional<String> city,
            @RequestParam Optional<String> state) {

        List<TrainingCenter> centers = service.getAllTrainingCenters(city, state);
        return ResponseEntity.ok(centers);
    }

    // Method to Map DTO to Entity
    private TrainingCenter mapDtoToEntity(TrainingCenterDTO dto) {
        TrainingCenter center = new TrainingCenter();
        center.setCenterName(dto.getCenterName());
        center.setCenterCode(dto.getCenterCode());
        center.setAddress(dto.getAddress());
        center.setStudentCapacity(dto.getStudentCapacity());
        center.setCouresesOffer(dto.getCoursesOffered());
        center.setContactEmail(dto.getContactEmail());
        center.setContactPhone(dto.getContactPhone());
        return center;
    }





}
