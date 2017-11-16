package bolo;

public class DC_RaspasDeChocolate extends BoloDecorator{
    public DC_RaspasDeChocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 15.00;
    }

    @Override
    public String getDecoracao() {
        if(this.bolo.getDecoracao() == null)
            return "Raspas de Chocolate";

        return this.bolo.getDecoracao() + " + Raspas de Chocolate";
    }
}
