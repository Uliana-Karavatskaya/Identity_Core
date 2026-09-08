package com.lemmy.core.controller;

import com.lemmy.core.dto.RuleDto;
import com.lemmy.core.service.RuleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RuleController {

    private final RuleService ruleService;

    @GetMapping("/core/rules")
    public ResponseEntity<List<RuleDto>> allRules() {
        return ResponseEntity.ok(ruleService.allRules());
    }
}
