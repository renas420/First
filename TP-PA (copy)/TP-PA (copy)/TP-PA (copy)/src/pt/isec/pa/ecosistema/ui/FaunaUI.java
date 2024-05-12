package pt.isec.pa.ecosistema.ui;

import pt.isec.pa.ecosistema.model.fsm.FaunaContext;

public class FaunaUI {
    FaunaContext ecosystem;

    public FaunaUI(FaunaContext ecosystem) {
        this.ecosystem = ecosystem;
    }

    public void start() {
        int cont=0;
        ecosystem.initializeFaunas();
        ecosystem.initializeInanimados();
        drawSet();
            do {
                for(int i=0;i<ecosystem.getFaunas().size();i++) {
                    switch (ecosystem.getState(i)) { //tengo que mandar a fauna
                        case PROCURA_COMIDA -> procuraComidaUI(i);
                        case MOVENDO -> movendoUI(i);
                        case REPRODUZINDO -> reproduzindoUI();
                        case PARADO -> paradoUI();
                    }
                };
               System.out.print("\n"); drawSet();
                cont++;
            } while (cont < 1);
    }
    private void drawSet() {
        for (int i = 0; i < ecosystem.getX(); i++) {
            for (int j = 0; j < ecosystem.getY(); j++) {
                System.out.print(ecosystem.drawSet()[i][j]);
            }
            System.out.print("\n");
        }
    }
    private boolean procuraComidaUI(int i){
        //ecosystem.setCurrentState(ecosystem,i);
        System.out.println("Procurando comida");
        return true;
    }
    private boolean movendoUI(int i) {
        ecosystem.move(i);
        return true;
    }
    private boolean reproduzindoUI() {
        System.out.println("Reproduzindo...");
        return true;
    }
    private boolean paradoUI() {
        System.out.println("Parado...");
        return true;
    }

}
