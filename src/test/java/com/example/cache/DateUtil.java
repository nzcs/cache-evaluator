package com.example.cache;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    public static final ZoneId DEFAULT_ZONE_ID = ZoneId.systemDefault();


    public static LocalDate parse(String pattern) {
        String p = pattern;
        if (pattern.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}$")) {
            p += " 00:00";
        }
        return LocalDate.parse(p, DATE_TIME_FORMATTER);
    }

}
