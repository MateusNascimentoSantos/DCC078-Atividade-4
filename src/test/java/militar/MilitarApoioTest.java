package militar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MilitarApoioTest {
    void deveRetornarDiariaApoioComSoldado() {
        Patente patente = new Soldado();
        MilitarApoio militar = new MilitarApoio(100.0f);
        militar.setPatente(patente);
        assertEquals(100.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaApoioComCabo() {
        Patente patente = new Cabo();
        MilitarApoio militar = new MilitarApoio(100.0f);
        militar.setPatente(patente);
        assertEquals(100.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaApoioComSargento() {
        Patente patente = new Sargento();
        MilitarApoio militar = new MilitarApoio(100.0f);
        militar.setPatente(patente);
        assertEquals(100.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaApoioComTenente() {
        Patente patente = new Tenente();
        MilitarApoio militar = new MilitarApoio(100.0f);
        militar.setPatente(patente);
        assertEquals(100.0f, militar.calcularDiaria(), 0.01f);
    }

}