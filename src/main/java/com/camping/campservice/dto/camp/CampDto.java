package com.camping.campservice.dto.camp;

public record CampDto(
        String campName,
        String address,
        String region,
        String imageUrl
) {}
