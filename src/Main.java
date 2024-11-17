import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Creo un oggetto passandogli la data in stringa
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //Formatto la data in long per ottenere il risultato richiesto
        DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        //applico il formatter alla data
        String dataFormattata2 = data.format(dataFormattata);
        //Stampo il risultato
        System.out.println(dataFormattata2);
    }
}


//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Fai attenzione a usare almeno Java 8
//Crea dei test per questo esercizio