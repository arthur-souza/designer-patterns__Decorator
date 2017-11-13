package bolo;

public class DC_GranuladoDeChocolate extends BoloDecorator{
    public DC_GranuladoDeChocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 5.0;
    }

    @Override
    public String getDecoracao() {
        if(bolo.getDecoracao() == null)
            return "Granulado de Chocolate";

        return bolo.getDecoracao() + " + Granulado de Chocolate";
    }
}
