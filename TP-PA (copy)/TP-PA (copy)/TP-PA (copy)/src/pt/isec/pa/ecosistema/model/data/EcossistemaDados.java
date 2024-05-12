package pt.isec.pa.ecosistema.model.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EcossistemaDados implements Serializable { //,IGameEngineEvolve
    private Set<IElemento> elementos = new HashSet<>();
    private int rows = 10, cols = 10;
    private ArrayList<Fauna> faunas = new ArrayList<>();
    private String[][] tela = new String[rows][cols];
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
    public ArrayList<Fauna> getFaunas() {
        return faunas;
    }
    public boolean isEmpty(int i, int y) {
        if (tela[i][y] == " - ")
            return true;
        return false;
    }
    public void move(int i) {
        double r = Math.random();
        if (r <= .25)
            moveRight(i);
        else if (r <= .50)
            moveLeft(i);
        else if (r <= .75)
            moveDown(i);
        else
            moveUp(i);
    }
    public void moveRight(int i) {
        if (faunas.get(i).getY() < cols - 1 && isEmpty(faunas.get(i).getX(), faunas.get(i).getY() + 1))
            faunas.get(i).setY(faunas.get(i).getY() + 1);

    }
    public void moveLeft(int i) {
        if (faunas.get(i).getY() > 0 && isEmpty(faunas.get(i).getX(), faunas.get(i).getY() - 1))
            faunas.get(i).setY(faunas.get(i).getY() - 1);
    }

    public void moveUp(int i) {
        if (faunas.get(i).getX() > 0 && isEmpty(faunas.get(i).getX() - 1, faunas.get(i).getY()))
            faunas.get(i).setX(faunas.get(i).getX() - 1);
    }

    public void moveDown(int i) {
        if (faunas.get(i).getX() < rows - 1 && isEmpty(faunas.get(i).getX() + 1, faunas.get(i).getY()))
            faunas.get(i).setX(faunas.get(i).getX() + 1);
    }
    public void setFaunas(int num) {
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            //System.out.println(faunas.size());
            int x = r.nextInt(this.rows -1 -1 ) + 1; //gera de 0 a cols -1 pq nao quero as bordas e -2 para ser de
            int y = r.nextInt(this.cols -1 -1 ) + 1;
            faunas.add(new Fauna(x, y));
            elementos.add(faunas.get(i));
        }
    }
    public void setInanimados() {
        for (int i = 0; i < cols - 1; i++) { //Coloco <-1> pois o proximo dá cover nessa posição
            int x = 0;
            elementos.add(new Inanimado(x, i));
        }
        for (int i = 0; i < cols - 1; i++) {
            int x = rows - 1;
            elementos.add(new Inanimado(x, i));
        }
        for (int i = 0; i < rows - 1; i++) {
            int y = 0;
            elementos.add(new Inanimado(i, y));
        }
        for (int i = 0; i < rows; i++) { //Apenas aqui é que nao coloco <-1> porque já nao tenho o proximo
            int y = cols - 1;
            elementos.add(new Inanimado(i, y));
        }
    }
    public String[][] drawSet() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                tela[i][j] = " - ";
        }
        for (IElemento elemento:elementos) {
            tela[elemento.getX()][elemento.getY()] = elemento.toString();
        }
        return tela;
    }
    public void elementoMorreu(IElemento elemento){
        elementos.remove(elemento);
    }
    public void reproduz(IElemento elemento){


    }
    public void visinhoLivre(IElemento elemento){

        if(isEmpty(elemento.getX(),elemento.getY()-cols)
        if(isEmpty(elemento.getX()+1,elemento.getY()-cols+1)
        if(isEmpty(elemento.getX()+1,elemento.getY())
        if(isEmpty(elemento.getX()+1,elemento.getY()+cols+1)
        if(isEmpty(elemento.getX(),elemento.getY()+cols)
        if(isEmpty(elemento.getX()-1,elemento.getY()+cols-1)
        if(isEmpty(elemento.getX()-1,elemento.getY())
        if(isEmpty(elemento.getX()-1,elemento.getY()-cols-1)

    }
}



