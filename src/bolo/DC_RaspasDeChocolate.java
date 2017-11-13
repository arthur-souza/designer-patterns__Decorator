package bolo;

public class DC_RaspasDeChocolate extends BoloDecorator{
    public DC_RaspasDeChocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 15.0;
    }

    @Override
    public String getDecoracao() {
        if(bolo.getDecoracao() == null)
            return "Raspas de Chocolate";

        return bolo.getDecoracao() + " + Raspas de Chocolate";
    }
}
