package bolo;

public class CB_Chantili extends BoloDecorator{
    public CB_Chantili(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 15.0;
    }

    @Override
    public String getCobertura() {
        if(bolo.getCobertura() == null)
            return "Chantili";

        return bolo.getCobertura() + " + Chantili";
    }
}
