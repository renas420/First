package pt.isec.pa.ecosistema.model.fsm;

import java.util.ArrayList;
import pt.isec.pa.ecosistema.model.data.Fauna;
import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
//FaunaUI fala para aqui
import static pt.isec.pa.ecosistema.model.fsm.FaunaState.MOVENDO;

public class FaunaContext {
    private EcossistemaDados data;
    private IFauna currentState;

    public FaunaContext(){
        this.data = new EcossistemaDados();
        //this.currentState = MOVING.getInstance(this,data);
    }
    public void initializeFaunas(){
        data.setFaunas(10); //MAndo o numero de quantas faunas quero que começe
        for(Fauna fauna : data.getFaunas()){
            fauna.setState(MOVENDO.getInstance(this,data));
        }
    }
    public void initializeInanimados(){
        data.setInanimados();
    }
    void changeState(IFauna newState){
        this.currentState = newState;
    }
    public FaunaState getState(int i){
        currentState=data.getFaunas().get(i).getState(); //Depois o current state que tenho de mudar para mudar de estado é na o atributo da fauna
        return currentState.getState(); //Está sempre a correr isto
    }

    public void setCurrentState(IFauna currentState,int i) {
        data.getFaunas().get(i).setState(currentState);
        this.currentState = currentState;
    }
    public String[][] drawSet(){
       return data.drawSet();
    }
    public int getX(){return data.getRows();}
    public int getY(){return data.getCols();}
    public ArrayList<Fauna> getFaunas(){return data.getFaunas();}
    public void move(int i){
        currentState.move(i);
    }

}
