package bolo;

public class CB_Chantili extends BoloDecorator{
    public CB_Chantili(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 15.00;
    }

    @Override
    public String getCobertura() {
        if(this.bolo.getCobertura() == null)
            return "Chantili";

        return this.bolo.getCobertura() + " + Chantili";
    }
}
