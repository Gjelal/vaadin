package ch.hesge.clement;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route(value="accueil", layout=MainView.class)
public class AccueilComponent extends HorizontalLayout {

    private Label label;
    private Image image;

    public AccueilComponent(){
        label = new Label("C'est le texte");
        image = new Image("frontend/image/bibliotheque.jpg", "alt");
        add(label, image);
    }

}
