package com.devlazaro;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Date instantiation---");

        LocalDate dateOne = LocalDate.now();

        //Local
        LocalDateTime dateTwo = LocalDateTime.now();

        //Date GMT
        Instant dateThree = Instant.now();

        System.out.println(dateOne);
        System.out.println(dateTwo);
        System.out.println(dateThree);

        System.out.println("---Through text---");

        LocalDate dateFour = LocalDate.parse("2024-08-12");

        //format ISO 8601
        LocalDateTime dateFive = LocalDateTime.parse("2024-08-12T20:22:30");

        //Default UTC
        Instant dateSix = Instant.parse("2024-08-12T20:22:30Z");

        //Other timezone, São Paulo
        Instant dateSeven = Instant.parse("2024-08-12T20:22:30-03:00");

        System.out.println(dateFour);
        System.out.println(dateFive);
        System.out.println(dateSix);
        System.out.println(dateSeven);

        System.out.println("---Formatted date---");

        //Formatter
        //DateTimeFormatter formatter1;
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate dateEight = LocalDate.parse("12/08/2006",  DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime dateNine = LocalDateTime.parse("12/08/2006 20:00", formatter2);

        System.out.println(dateEight);
        System.out.println(dateNine);

        System.out.println("---Isolated date---");
        LocalDate dateTen = LocalDate.of(2002, 12, 28);
        LocalDateTime dateEleven = LocalDateTime.of(2002, 12, 10, 12, 30);

        System.out.println(dateTen);
        System.out.println(dateEleven);

        System.out.println("--------------------");
        System.out.println("---Date to text conversion---");

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        String dateFourText = dateFour.format(formatter3);
        //Also
        String dateFourTextTwo = formatter3.format(dateFour);

        String dateFiveText = dateFive.format(formatter2);

        String dateSixText = formatter4.format(dateSix);

        System.out.println(dateFourText);
        System.out.println(dateFourTextTwo);
        System.out.println(dateFiveText);
        System.out.println(dateSixText);

        System.out.println("--------------------");
        System.out.println("---Global to local conversion---");

        LocalDate conversionOne = LocalDate.ofInstant(dateSix, ZoneId.systemDefault());
        LocalDate conversionTwo = LocalDate.ofInstant(dateSix, ZoneId.of("Portugal"));
        LocalDateTime conversionThree = LocalDateTime.ofInstant(dateSix, ZoneId.of("São Paulo"));

        System.out.println(conversionOne);
        System.out.println(conversionTwo);
        System.out.println(conversionThree);

        int dayAtDate = dateFour.getDayOfMonth();

        System.out.printf("Date %s - Day %d \n", dateFour, dateFour.getDayOfMonth());

        System.out.println("--------------------");

        LocalDate pastWeek = LocalDate.now().minusDays(7);
        LocalDate nextWeek = LocalDate.now().plusDays(7);

        System.out.println("PastWeek: "+ pastWeek);
        System.out.println("NextWeek: "+ nextWeek);

        LocalDateTime oneHourAgo = LocalDateTime.now().minusHours(1);
        LocalDateTime twoMinutesAgo = LocalDateTime.now().minusMinutes(2);

        System.out.println(oneHourAgo);
        System.out.println(twoMinutesAgo);

        Duration duration = Duration.between(nextWeek, pastWeek);
        //LocalDate does not have hours, that's why the error occurs, to solve it use .atTime(hour, minutes) or use .atStartOfDay()

        System.out.println("Duration between PastWeek and NextWeek" +duration);

    }
}