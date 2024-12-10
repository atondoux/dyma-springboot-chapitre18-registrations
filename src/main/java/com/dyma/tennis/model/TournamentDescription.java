package com.dyma.tennis.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;
import java.util.UUID;

public record TournamentDescription(
        @NotNull(message = "Identifier is mandatory") UUID identifier,
        @NotBlank(message = "Name is mandatory") String name,
        @NotNull(message = "Start date is mandatory") LocalDate startDate,
        @NotNull(message = "End date is mandatory") LocalDate endDateDate,
        @Positive(message = "Prize money must be positive") Integer prizeMoney,
        @NotNull(message = "Capacity is mandatory") @Positive(message = "Capacity must be positive") Integer capacity
) {
}