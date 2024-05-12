package pt.isec.pa.ecosistema.model.fsm.states;

import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
import pt.isec.pa.ecosistema.model.fsm.FaunaContext;
import pt.isec.pa.ecosistema.model.fsm.FaunaState;
import pt.isec.pa.ecosistema.model.fsm.FaunaStateAdapter;

public class ProcuraComida extends FaunaStateAdapter {

    public ProcuraComida(FaunaContext context,
        EcossistemaDados data) {
        super(context, data);
    }

    @Override
    public FaunaState getState() {
        return FaunaState.PROCURA_COMIDA;
    }
}
