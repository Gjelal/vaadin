package ch.hesge.clement;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route(value="liste", layout = MainView.class)

public class EcranListeLivre extends VerticalLayout {

    private Grid<Livre> grid;

    public EcranListeLivre(){
        grid = new Grid<>(Livre.class);
        grid.setColumns("titre", "auteur", "editeur", "annee");
        
    }

}
