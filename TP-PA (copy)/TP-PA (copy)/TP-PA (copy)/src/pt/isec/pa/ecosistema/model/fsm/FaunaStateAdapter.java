package pt.isec.pa.ecosistema.model.fsm;

import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
//--------------Defaults metods---------------
public abstract class FaunaStateAdapter implements IFauna {
    protected FaunaContext context;
    protected EcossistemaDados data;

    protected FaunaStateAdapter(FaunaContext context, EcossistemaDados data){
        this.context = context;
        this.data = data;
    }
    //protected void changeState(FaunaState newState){
        //context.changeState(newState.getInstance(context,data));
    //}
    @Override
    public void move(int i){}

}
