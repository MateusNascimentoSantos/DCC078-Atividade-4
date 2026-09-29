package militar;

public class MilitarApoio extends Militar {

    public MilitarApoio(float valorBase) {
        super(valorBase);
    }

    public float calcularDiaria() {
        return this.valorBase;
    }
}