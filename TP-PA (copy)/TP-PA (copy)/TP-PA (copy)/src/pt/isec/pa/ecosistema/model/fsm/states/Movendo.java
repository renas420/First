package pt.isec.pa.ecosistema.model.fsm.states;

import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
import pt.isec.pa.ecosistema.model.fsm.FaunaContext;
import pt.isec.pa.ecosistema.model.fsm.FaunaState;
import pt.isec.pa.ecosistema.model.fsm.FaunaStateAdapter;

public class Movendo extends FaunaStateAdapter {

    public Movendo(FaunaContext context,
        EcossistemaDados data) {
        super(context, data);
    }

    @Override
    public FaunaState getState() {
        return FaunaState.MOVENDO;
    }
    @Override
    public void move(int i){
        //System.out.println("Movendo"+i);
        data.move(i);
        //data.
    }
}
