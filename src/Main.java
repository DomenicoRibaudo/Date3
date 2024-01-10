import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        ottieni l'anno
//        ottieni il mese
//        ottieni il giorno
//        ottieni il giorno della settimana
//        Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        String inputString = "2023-03-01T13:00:00Z";
        ZonedDateTime zonedDateTime = OffsetDateTime.parse(inputString).toZonedDateTime();

        //Ottieni anno, mese, giorno, giorno della settimana
        Integer year = zonedDateTime.getYear();
        String month = zonedDateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        Integer day =  zonedDateTime.getDayOfMonth();
        String dayOfWeek = zonedDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        //stampa i risultati
        System.out.println("Anno " + year);
        System.out.println("Mese " + month);
        System.out.println("Giorno del mese " + day);
        System.out.println("Giorno della settimana " + dayOfWeek);
    }

}
