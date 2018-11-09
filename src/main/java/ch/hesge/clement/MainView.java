package ch.hesge.clement;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;


@Route()
public class MainView extends VerticalLayout implements RouterLayout{

    public MainView() {
        MyBarComponent myBarComponent = new MyBarComponent("https://www.google.ch", "Connexion");
        add(myBarComponent);
    }
}
