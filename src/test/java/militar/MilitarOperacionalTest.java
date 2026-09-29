package militar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MilitarOperacionalTest {

    @Test
    void deveRetornarDiariaOperacionalComSoldado() {
        Patente patente = new Soldado();
        MilitarOperacional militar = new MilitarOperacional(200.0f);
        militar.setPatente(patente);
        assertEquals(200.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaOperacionalComCabo() {
        Patente patente = new Cabo();
        MilitarOperacional militar = new MilitarOperacional(200.0f);
        militar.setPatente(patente);
        assertEquals(220.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaOperacionalComSargento() {
        Patente patente = new Sargento();
        MilitarOperacional militar = new MilitarOperacional(200.0f);
        militar.setPatente(patente);
        assertEquals(240.0f, militar.calcularDiaria(), 0.01f);
    }

    @Test
    void deveRetornarDiariaOperacionalComTenente() {
        Patente patente = new Tenente();
        MilitarOperacional militar = new MilitarOperacional(200.0f);
        militar.setPatente(patente);
        assertEquals(260.0f, militar.calcularDiaria(), 0.01f);
    }

}
