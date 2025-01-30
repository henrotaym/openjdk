package entities.menu.actions;

import interfaces.factories.menu.Action;

public class AddCardMenu implements Action {
    
    @Override
    public void execute() {
        System.out.println("🗑️ 3.Créer une carte");
    }
}