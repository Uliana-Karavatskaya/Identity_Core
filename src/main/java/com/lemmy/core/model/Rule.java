package com.lemmy.core.model;

import com.lemmy.core.dto.RuleStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Rule {
    private Long id;
    private Long userId;
    private String name;
    private String description;
    private RuleStatus status;
    private Integer daysRemaining;
    private Integer streak;
    private LocalDateTime timeCreated;


}
