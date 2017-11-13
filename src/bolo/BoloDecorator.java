package bolo;

public abstract class BoloDecorator extends Bolo{
    protected Bolo bolo;

    public BoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }

    @Override
    public String getNome() {
        return bolo.getNome();
    }

    @Override
    public String getSabor() {
        return bolo.getSabor();
    }

    @Override
    public Double getValor() {
        return bolo.getValor();
    }

    @Override
    public String getCobertura() {
        return bolo.getCobertura();
    }

    @Override
    public String getDecoracao() {
        return bolo.getDecoracao();
    }
}
