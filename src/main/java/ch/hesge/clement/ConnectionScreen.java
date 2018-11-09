package ch.hesge.clement;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route(layout = MyBarComponent.class)
public class ConnectionScreen extends HorizontalLayout {

    public ConnectionScreen(){
        add(new LoginComponent());
    }

}
