package com.example.Asset_Transfer_Request.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String assetName;
    private String assetType;
    private String assetStatus;
    private String location;

}