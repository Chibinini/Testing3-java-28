import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
        //Nome del test parlante
    void testControllaCheLaDataNonSiaNull() {
        //oggetto che va sempre passato per renderlo indipendente
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //verifica che l'oggetto non sia null
        assertNotNull(data, "L'oggetto creato non è null");
    }

    @Test
    void testControllaCheIcampiSianoValidi() {
        //Oggetto
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //Verifica che i campi siano corretti
        assertEquals(2023, data.getYear(), "L'anno dovrebbe essere 2023");
        assertEquals(3, data.getMonthValue(), "Il mese dovrebbe essere marzo");
        assertEquals(1, data.getDayOfMonth(), "Il giorno dovrebbe essere 1");
    }
}
