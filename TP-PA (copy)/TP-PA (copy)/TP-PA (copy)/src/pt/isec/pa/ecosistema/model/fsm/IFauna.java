package pt.isec.pa.ecosistema.model.fsm;

public interface IFauna {
    FaunaState getState();
    void move(int i);
}
