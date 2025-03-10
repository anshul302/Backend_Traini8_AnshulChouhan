package com.traini8.backend.service;

import com.traini8.backend.entity.TrainingCenter;
import com.traini8.backend.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter createTrainingCenter(TrainingCenter center){
        // Server timestamp for created on
        center.setCreatedOn(Instant.now().toEpochMilli());

        return repository.save(center);

    }

    // Modify getAllTrainingCenters to handle optional filters
    public List<TrainingCenter> getAllTrainingCenters(Optional<String> city, Optional<String> state) {
        if (city.isPresent() && state.isPresent()) {
            // Filter by both city and state
            return repository.findByAddress_CityAndAddress_State(city.get(), state.get());
        } else if (city.isPresent()) {
            // Filter by city only
            return repository.findByAddress_City(city.get());
        } else if (state.isPresent()) {
            // Filter by state only
            return repository.findByAddress_State(state.get());
        } else {
            // No filters, return all training centers
            return repository.findAll();
        }
    }

}
