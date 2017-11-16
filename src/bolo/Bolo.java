package bolo;

public abstract class Bolo {
    protected String nome;
    protected String sabor;
    protected Double valor;
    protected String cobertura;
    protected String decoracao;

    public String getNome() {
        return this.nome;
    }

    public String getSabor() {
        return this.sabor;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getCobertura() {
        return this.cobertura;
    }

    public String getDecoracao() {
        return this.decoracao;
    }
}
