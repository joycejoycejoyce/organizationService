package com.joyce.organizationservice.service.impl;

import com.joyce.organizationservice.dto.OrganizationDto;
import com.joyce.organizationservice.entity.Organization;
import com.joyce.organizationservice.mappper.SourceDestinationMapper;
import com.joyce.organizationservice.repository.OrganizationRepository;
import com.joyce.organizationservice.service.OrganizationService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository repository;

    private SourceDestinationMapper mapper = Mappers.getMapper(SourceDestinationMapper.class);
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization source = mapper.sourceToDestination(organizationDto);
        Organization organization = repository.save(source);

        return SourceDestinationMapper.INSTANCE.destinationToSource(organization);
    }
}
