package bolo;

public class CB_LeiteCondensado extends BoloDecorator{
    public CB_LeiteCondensado(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 18.0;
    }

    @Override
    public String getCobertura() {
        if(this.bolo.getCobertura() == null)
            return "Leite Condesado";

        return this.bolo.getCobertura() + " + Leite Condesado";
    }
}
