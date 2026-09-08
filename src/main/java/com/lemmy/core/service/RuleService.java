package com.lemmy.core.service;

import com.lemmy.core.dto.RuleDto;
import com.lemmy.core.dto.RuleStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class RuleService {
    public List<RuleDto> allRules() {
        return Arrays.asList(
                new RuleDto(1L, 1L, "No coffee", "", RuleStatus.ACTIVE, 30, 0, LocalDateTime.now()),
                new RuleDto(2L, 1L, "No chips", "", RuleStatus.CORE, 0, 150, LocalDateTime.now())
        );
    }
}