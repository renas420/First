package pt.isec.pa.ecosistema.model.data;

public final class Inanimado extends ElementoBase{

    private String nome;
    private int x,y;
    private static int count = 0;
    private int id;

    public Inanimado(int x, int y) {
        this.id = count++;
        this.nome = " I ";
        this.x = x;
        this.y = y;
    }

    @Override
    public int getId() {
        return 0;
    }
    @Override
    public Elemento getType() {
        return Elemento.INANIMADO;
    }
    @Override
    public Area getArea() {
        return null;
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
    public String toString() {
        return this.nome;
    }
}
