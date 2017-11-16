package bolo;

public abstract class BoloDecorator extends Bolo{
    protected Bolo bolo;

    public BoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }

    @Override
    public String getNome() {
        return this.bolo.getNome();
    }

    @Override
    public String getSabor() {
        return this.bolo.getSabor();
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor();
    }

    @Override
    public String getCobertura() {
        return this.bolo.getCobertura();
    }

    @Override
    public String getDecoracao() {
        return this.bolo.getDecoracao();
    }
}
