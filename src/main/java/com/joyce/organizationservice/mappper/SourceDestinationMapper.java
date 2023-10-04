package com.joyce.organizationservice.mappper;

import com.joyce.organizationservice.dto.OrganizationDto;
import com.joyce.organizationservice.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SourceDestinationMapper {

    SourceDestinationMapper INSTANCE = Mappers.getMapper(SourceDestinationMapper.class);
    Organization sourceToDestination(OrganizationDto dto);
    OrganizationDto destinationToSource(Organization organization);
}
