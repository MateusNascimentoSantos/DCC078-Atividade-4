package militar;

public abstract class Militar {
    protected Patente patente;

    protected float valorBase;

    public Militar(float valorBase){
        this.valorBase = valorBase;
    }

    public void setPatente(Patente patente){
        this.patente = patente;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularDiaria();
}
