package ch.hesge.clement;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value="connexion", layout=MainView.class)

public class LoginComponent extends FormLayout {

    private Label lblLogin;
    private Label lblPass;
    private TextField tfLogin;
    private TextField tfPass;
    private Button btnConnect;

    public LoginComponent(){
        lblLogin = new Label("Identifiant :");
        tfLogin = new TextField();
        lblPass = new Label("Mot de passe :");
        tfPass = new TextField();
        btnConnect = new Button("Connexion");
        add(lblLogin, tfLogin, lblPass, tfPass, btnConnect);
    }

}
