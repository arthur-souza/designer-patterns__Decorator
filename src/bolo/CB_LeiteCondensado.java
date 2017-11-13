package bolo;

public class CB_LeiteCondensado extends BoloDecorator{
    public CB_LeiteCondensado(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 10.0;
    }

    @Override
    public String getCobertura() {
        if(bolo.getCobertura() == null)
            return "Leite Condesado";

        return bolo.getCobertura() + " + Leite Condesado";
    }
}
