package com.camping.campservice.controller;

import com.camping.campservice.dto.camp.CreateRqDto;
import com.camping.campservice.entity.Camp;
import com.camping.campservice.service.CampService;
import com.zaxxer.hikari.HikariDataSource;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camp")
@RequiredArgsConstructor
public class CampController {

    private final CampService campService;
    private final javax.sql.DataSource dataSource;

    @GetMapping
    public ResponseEntity<List<Camp>> getCamps() {
        return ResponseEntity.ok().body(this.campService.getCamps());
    }

    @PostMapping()
    public ResponseEntity<Void> createCamp(@RequestBody CreateRqDto createRqDto) {
        this.campService.createCamp(createRqDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}