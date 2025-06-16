package com.javapractise.rest_demo.controller;

import com.javapractise.rest_demo.model.CloudVendor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendor){
        return new CloudVendor("C1","Maggie","Address1","3145165256");
    }
}
