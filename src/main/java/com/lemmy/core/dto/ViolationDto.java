package com.lemmy.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ViolationDto {
    private Long id;
    private Long ruleId;
    private String description;
    private LocalDateTime date;
}
