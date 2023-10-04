package com.joyce.organizationservice.controller;

import com.joyce.organizationservice.dto.OrganizationDto;
import com.joyce.organizationservice.mappper.SourceDestinationMapper;
import com.joyce.organizationservice.service.OrganizationService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.aot.AotServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/organizations")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;


    // save organization api
    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto dto) {
        OrganizationDto saved = organizationService.saveOrganization(dto);
        ResponseEntity<OrganizationDto> response = new ResponseEntity<>(saved, HttpStatus.CREATED);
        return response;
    }
}
