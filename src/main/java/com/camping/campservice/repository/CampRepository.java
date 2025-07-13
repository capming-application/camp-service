package com.camping.campservice.repository;

import com.camping.campservice.entity.Camp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampRepository extends JpaRepository<Camp, Integer> {

}
