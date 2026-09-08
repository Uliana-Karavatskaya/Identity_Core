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
public class RuleDto {
    private Long id;
    private Long userId;
    private String name;
    private String description;
    private RuleStatus status;
    private Integer daysRemaining;
    private Integer streak;
    private LocalDateTime timeCreated;
}
