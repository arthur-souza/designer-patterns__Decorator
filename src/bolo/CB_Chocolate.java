package bolo;

public class CB_Chocolate extends BoloDecorator{
    public CB_Chocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 12.00;
    }

    @Override
    public String getCobertura() {
        if(this.bolo.getCobertura() == null)
            return "Chocolate";

        return this.bolo.getCobertura() + " + Chocolate";
    }
}
