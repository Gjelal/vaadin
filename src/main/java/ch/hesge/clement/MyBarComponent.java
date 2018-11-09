package ch.hesge.clement;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLayout;

public class MyBarComponent extends HorizontalLayout implements RouterLayout {

    private Label title;
    private Button button;
    private Anchor anchor;

    public MyBarComponent(String url, String text) {
        title = new Label("App bibliothèque");
        anchor = new Anchor();
        anchor.setText("Livres");
        anchor.setHref(url);
        button = new Button(text);
        add(title, anchor, button);
    }
}
