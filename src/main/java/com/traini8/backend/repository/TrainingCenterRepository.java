package com.traini8.backend.repository;

import com.traini8.backend.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long> {



    List<TrainingCenter> findByAddress_City(String city);

    // Find by state in the Address embeddable
    List<TrainingCenter> findByAddress_State(String state);

    // Find by both city and state in the Address embeddable
    List<TrainingCenter> findByAddress_CityAndAddress_State(String city, String state);
}
