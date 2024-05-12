package pt.isec.pa.ecosistema.model.data;
import pt.isec.pa.ecosistema.model.fsm.IFauna;

public final class Flora extends ElementoBase implements IElementoComForca {
    private String nome;
    private double forca;
    private int x, y;
    private static int count = 0;
    private int id;
    private IFauna estado;

    public Flora(int x, int y) {
        this.nome=" F ";
        this.id = count++;
        this.forca = 50;
        this.x = x;
        this.y = y;
    }
    public void evolve(EcossistemaDados dados){
        if(forca==0)
            dados.elementoMorreu(this);
        this.setForca(forca+0.5);
        if(forca>=90)
            dados.reproduz(this);
    }
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public Elemento getType() {
        return Elemento.FLORA;
    }

    @Override
    public Area getArea() {
        return null;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getForca() {
        return this.forca;
    }

    @Override
    public void setForca(double forca) {
        if(this.forca<100)
        this.forca = forca;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}