package com.camping.campservice.service;

import com.camping.campservice.dto.camp.CreateRqDto;
import com.camping.campservice.entity.Camp;
import com.camping.campservice.mapper.CampMapper;
import com.camping.campservice.repository.CampRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CampService {

    private final CampRepository campRepository;

    public List<Camp> getCamps() {
        return campRepository.findAll();
    }

    public void createCamp(CreateRqDto createrqDto) {
//        List<Camp> camps = CampMapper.INSTANCE.dtoListToEntityList(createrqDto.campDtoList());
        List<Camp> camps = createrqDto.campDtoList().stream()
                .map(dto -> {
                    Camp camp = new Camp();
                    camp.setCampName(dto.campName());
                    camp.setAddress(dto.address());
                    camp.setRegion(dto.region());
                    camp.setImageUrl(dto.imageUrl());
                    return camp;
                })
                .collect(Collectors.toList());
        this.campRepository.saveAll(camps);
    }


}
