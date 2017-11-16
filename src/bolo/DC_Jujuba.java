package bolo;

public class DC_Jujuba extends BoloDecorator{
    public DC_Jujuba(Bolo bolo) {
        super(bolo);
    }

    @Override
    public Double getValor() {
        return this.bolo.getValor() + 10.0;
    }

    @Override
    public String getDecoracao() {
        if(this.bolo.getDecoracao() == null)
            return "Jujuba";

        return this.bolo.getDecoracao() + " + Jujuba";
    }
}
