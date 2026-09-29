package militar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MilitarAviadorTest {

    @Test
    void deveRetornarDiariaAviadorComSoldado() {
        Patente patente = new Soldado();
        MilitarAviador militar = new MilitarAviador(150.0f);
        militar.setPatente(patente);
        militar.setHorasVoo(2);
        assertEquals(300.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaAviadorComCabo() {
        Patente patente = new Cabo();
        MilitarAviador militar = new MilitarAviador(150.0f);
        militar.setPatente(patente);
        militar.setHorasVoo(2);
        assertEquals(330.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaAviadorComSargento() {
        Patente patente = new Sargento();
        MilitarAviador militar = new MilitarAviador(150.0f);
        militar.setPatente(patente);
        militar.setHorasVoo(2);
        assertEquals(360.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaAviadorComTenente() {
        Patente patente = new Tenente();
        MilitarAviador militar = new MilitarAviador(150.0f);
        militar.setPatente(patente);
        militar.setHorasVoo(2);
        assertEquals(390.0f, militar.calcularDiaria(), 0.01f);
    }
}
