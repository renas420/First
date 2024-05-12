package pt.isec.pa.ecosistema.model.data;
import pt.isec.pa.ecosistema.model.fsm.IFauna;

public final class Fauna extends ElementoBase implements IElementoComForca {

    private String nome;
    private int forca;
    private int x,y;
    private static int count = 0;
    private int id;
    private IFauna estado;
    public Fauna(int x,int y) {
        this.nome=" F ";
        this.id=count++;
        this.forca = 50;
        this.x = x;
        this.y = y;
    }
    public void evolve(EcossistemaDados dados){
        if(forca==0)
            dados.elementoMorreu(this);
        setForca(forca+0.5);
       // if(for)
    }
    public void setState(IFauna estado) {
        this.estado = estado;
    }
    public IFauna getState() {
        return estado;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public int getId() {return id;}
    @Override
    public Elemento getType() {
        return Elemento.FAUNA;
    }
    @Override
    public Area getArea() {
        return null;
    }
    @Override
    public double getForca() {
        return forca;
    }
    @Override
    public void setForca(double forca) {
        if(forca<=100)
            this.forca = (int) forca;
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
