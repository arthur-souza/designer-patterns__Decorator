package bolo;

public class DC_GranuladoDeChocolate extends BoloDecorator{
    public DC_GranuladoDeChocolate(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 8.00;
    }

    @Override
    public String getDecoracao() {
        if(this.bolo.getDecoracao() == null)
            return "Granulado de Chocolate";

        return this.bolo.getDecoracao() + " + Granulado de Chocolate";
    }
}
