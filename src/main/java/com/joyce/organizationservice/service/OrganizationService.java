package com.joyce.organizationservice.service;

import com.joyce.organizationservice.dto.OrganizationDto;
import com.joyce.organizationservice.entity.Organization;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto findOrganizationByCode(String code);
}
