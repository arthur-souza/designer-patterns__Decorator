package bolo;

public class DC_Jujuba extends BoloDecorator{
    public DC_Jujuba(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return bolo.getValor() + 10.0;
    }

    @Override
    public String getDecoracao() {
        if(bolo.getDecoracao() == null)
            return "Jujuba";

        return bolo.getDecoracao() + " + Jujuba";
    }
}
