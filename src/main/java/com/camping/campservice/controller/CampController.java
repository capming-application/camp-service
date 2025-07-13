package com.camping.campservice.controller;

import com.camping.campservice.entity.Camp;
import com.camping.campservice.service.CampService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampController {

    private final CampService campService;

    @GetMapping("/test")
    public ResponseEntity<List<Camp>> getCamps() {
        return ResponseEntity.ok().body(this.campService.getCamps());
    }
}