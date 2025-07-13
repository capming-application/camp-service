package com.camping.campservice.service;

import com.camping.campservice.entity.Camp;
import com.camping.campservice.repository.CampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampService {

    private final CampRepository campRepository;

    public List<Camp> getCamps() {
        return campRepository.findAll();
    }
}
