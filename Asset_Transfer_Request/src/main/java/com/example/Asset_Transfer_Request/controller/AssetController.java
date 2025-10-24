package com.example.Asset_Transfer_Request.controller;


import org.springframework.web.bind.annotation.*;
import com.example.Asset_Transfer_Request.entity.Asset;
import com.example.Asset_Transfer_Request.service.AssetService;
import java.util.List;


@RestController
@RequestMapping("/api/assets")
public class AssetController
{

    private final AssetService assetService;

    public AssetController(AssetService assetService)
    {
        this.assetService = assetService;
    }

    //to get all the users avilable in the database
    @GetMapping
    public List<Asset> getAllAssets()
    {
        return assetService.getAllAssets();
    }

    //to add the assets to the database
    @PostMapping
    public Asset createAsset(@RequestBody Asset asset)
    {
        return assetService.saveAsset(asset);
    }
    
}