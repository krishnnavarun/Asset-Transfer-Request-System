package com.example.Asset_Transfer_Request.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Asset_Transfer_Request.entity.Asset;


public interface AssetRepository extends JpaRepository<Asset, Long>{}