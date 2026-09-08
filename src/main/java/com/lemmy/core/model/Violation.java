package com.lemmy.core.model;

import java.time.LocalDateTime;

public class Violation {
    private Long id;
    private Rule rule;
    private String description;
    private LocalDateTime date;
}
