package entities.menu.actions;

import interfaces.factories.menu.Action;

public class ExitMenu implements Action {
    
    @Override
    public void execute() {
        System.out.println("👋 Merci d'avoir utilisé l'application !");
        System.exit(0);
    }
    
}
