package com.mvc_project.airport.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkWithDate {

    public static String obtainCurrentDateString() {

        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        return date;
    }
}
