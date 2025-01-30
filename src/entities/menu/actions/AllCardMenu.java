package entities.menu.actions;

import interfaces.factories.menu.Action;

public class AllCardMenu implements Action {

    @Override
    public void execute() {
        System.out.println("🔹 1.Lister les todos à faire");
    }
    
}
