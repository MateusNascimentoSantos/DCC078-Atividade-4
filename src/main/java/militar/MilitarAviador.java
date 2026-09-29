package militar;

public class MilitarAviador extends Militar{

    private int horasVoo;

    public MilitarAviador(float valorBase) {
        super(valorBase);
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    public float calcularDiaria() {
        return this.valorBase * this.horasVoo * (1 + this.patente.percentualAdicional());
    }
}
