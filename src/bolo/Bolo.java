package bolo;

public abstract class Bolo {
    protected String nome;
    protected String sabor;
    protected Double valor;
    protected String cobertura;
    protected String decoracao;

    public String getNome() {
        return nome;
    }

    public String getSabor() {
        return sabor;
    }

    public Double getValor() {
        return valor;
    }

    public String getCobertura() {
        return cobertura;
    }

    public String getDecoracao() {
        return decoracao;
    }
}
