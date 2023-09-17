package com.metagxd.metashop.userservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.sql.Date;

/**
 * DTO for {@link com.metagxd.metashop.userservice.entity.User}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UserDto(Long id, String name, String secondName, String thirdName, Date registered,
                      String registeredBy) implements Serializable {
}