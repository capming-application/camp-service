package com.camping.campservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name = "camp")
public class Camp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "camp_name")
    private String campName;

    @Column(name = "address")
    private String address;

    @Column(name = "region")
    private String region;

    @Column(name = "image_url")
    private String imageUrl;

}