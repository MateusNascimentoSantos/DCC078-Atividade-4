package militar;

public class MilitarOperacional extends Militar {

    public MilitarOperacional(float valorBase) {
        super(valorBase);
    }

    public float calcularDiaria() {
        return this.valorBase * (1 + this.patente.percentualAdicional());
    }
}
