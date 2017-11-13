package bolo;

public class CB_Chocolate extends BoloDecorator{
    public CB_Chocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 5.0;
    }

    @Override
    public String getCobertura() {
        if(bolo.getCobertura() == null)
            return "Chocolate";

        return bolo.getCobertura() + " + Chocolate";
    }
}
