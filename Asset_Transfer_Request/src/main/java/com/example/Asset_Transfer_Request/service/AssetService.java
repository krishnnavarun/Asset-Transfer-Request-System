package com.example.Asset_Transfer_Request.service;


import org.springframework.stereotype.Service;
import com.example.Asset_Transfer_Request.entity.Asset;
import com.example.Asset_Transfer_Request.repository.AssetRepository;
import java.util.List;


@Service
public class AssetService

{
    private final AssetRepository assetRepository;

    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    //to find and get all the users available in the database
    public List<Asset> getAllAssets()
    {
        return assetRepository.findAll();
    }

    //to save the assets to the database
    public Asset saveAsset(Asset asset)
    {
        return assetRepository.save(asset);
    }

}