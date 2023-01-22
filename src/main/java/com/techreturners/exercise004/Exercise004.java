package com.techreturners.exercise004;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exercise004 {

    LocalDateTime localDateTime;
    LocalDate locDate;
    public Exercise004(LocalDate date) {
        locDate = date;
        localDateTime  = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {

        localDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        int gigaSecond = 1000000000;

        return localDateTime.plusSeconds(gigaSecond);
    }
}

