package com.rocketseat.planner.activity;

import java.util.UUID;
import java.time.LocalDateTime;

public record ActivityData(UUID id, String title, LocalDateTime occurs_at) {

}
