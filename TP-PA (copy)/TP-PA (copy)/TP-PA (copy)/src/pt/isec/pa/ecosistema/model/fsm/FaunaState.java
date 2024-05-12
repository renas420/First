package pt.isec.pa.ecosistema.model.fsm;

import pt.isec.pa.ecosistema.model.data.EcossistemaDados;
import pt.isec.pa.ecosistema.model.fsm.states.ProcuraComida;
import pt.isec.pa.ecosistema.model.fsm.states.Movendo;
import pt.isec.pa.ecosistema.model.fsm.states.Reproduzindo;
import pt.isec.pa.ecosistema.model.fsm.states.Parado;

public enum FaunaState {
    PROCURA_COMIDA, MOVENDO, REPRODUZINDO, PARADO;
    public IFauna getInstance(FaunaContext context, EcossistemaDados data){
        return switch (this) {
            case PROCURA_COMIDA -> new ProcuraComida(context, data);
            case MOVENDO -> new Movendo(context, data);
            case REPRODUZINDO -> new Reproduzindo(context, data);
            case PARADO -> new Parado(context,data);

        };
    }
}
