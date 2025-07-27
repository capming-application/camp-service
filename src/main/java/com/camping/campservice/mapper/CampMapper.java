package com.camping.campservice.mapper;

import com.camping.campservice.dto.camp.CampDto;
import com.camping.campservice.entity.Camp;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CampMapper {

    CampMapper INSTANCE = Mappers.getMapper(CampMapper.class);

//    @Mapping(target = "id", ignore = true)
    Camp dtoToEntity(CampDto campDto);

    List<Camp> dtoListToEntityList(List<CampDto> campDtoList);

    CampDto EntityToDto(Camp camp);
}