package be.intecbrussel;

import javax.print.attribute.standard.MediaSize;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Instant maintenant = Instant.now();
        System.out.println(maintenant);
        Instant heureBelge = maintenant.plusSeconds(7200);
        System.out.println(heureBelge);
        LocalDateTime dateEtTemps = LocalDateTime.now();
        DateTimeFormatter lisible = DateTimeFormatter.ofPattern("E, dd MMMM yyyy HH:mm:ss");
        System.out.println(dateEtTemps.format(lisible));
        LocalDate autreDate = LocalDate.of(2015, 6, 23);
        System.out.println(autreDate);
        LocalTime autreTemps = LocalTime.of(10, 25, 2);
        LocalDateTime autreDateEtTemps = LocalDateTime.of(autreDate, autreTemps);
        System.out.println(autreDateEtTemps.format(lisible));
        ZoneId canadaZone = ZoneId.of("America/Toronto");
        System.out.println(canadaZone);
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println(systemZoneId);
        ZoneOffset timeZone = ZoneOffset.ofHours(2);
        System.out.println(timeZone);
        ZonedDateTime nowBXL = ZonedDateTime.now();
        ZonedDateTime nowToronto = ZonedDateTime.now(canadaZone);
        System.out.println(nowBXL.format(lisible));
        System.out.println(nowToronto.format(lisible));
        Duration duree = Duration.between(maintenant, heureBelge);
        System.out.println(duree.getSeconds());
        long milliseconds = ChronoUnit.MILLIS.between(maintenant, heureBelge);
        System.out.println(milliseconds);
        LocalDate maDate = LocalDate.now();
        long jours = ChronoUnit.DAYS.between(autreDate, maDate);
        System.out.println(jours);
    }
}
