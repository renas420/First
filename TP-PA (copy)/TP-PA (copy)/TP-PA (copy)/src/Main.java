import pt.isec.pa.ecosistema.model.fsm.FaunaContext;
import pt.isec.pa.ecosistema.ui.FaunaUI;

public class Main {

    public static void main(String[] args) {

        FaunaContext ecosystem = new FaunaContext();
        FaunaUI ui = new FaunaUI(ecosystem);
        ui.start();
    }
}