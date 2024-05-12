package pt.isec.pa.ecosistema.model.fsm.states;

import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
import pt.isec.pa.ecosistema.model.fsm.FaunaContext;
import pt.isec.pa.ecosistema.model.fsm.FaunaState;
import pt.isec.pa.ecosistema.model.fsm.FaunaStateAdapter;

public class Reproduzindo extends FaunaStateAdapter {

    public Reproduzindo(FaunaContext context,
        EcossistemaDados data) {
        super(context, data);
    }

    @Override
    public FaunaState getState() {
        return FaunaState.REPRODUZINDO;
    }
}
