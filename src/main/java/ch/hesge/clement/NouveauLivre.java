package ch.hesge.clement;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value="nouveau", layout=MainView.class)

public class NouveauLivre extends FormLayout {

    private Label lblTitre;
    private Label lblAuteur;
    private Label lblEditeur;
    private Label lblAnnee;
    private TextField tfTitre;
    private TextField tfAuteur;
    private TextField tfEditeur;
    private TextField tfAnnee;
    private Button btnCreer;

    public NouveauLivre(){
        this.lblTitre = new Label("Titre : ");
        this.lblAuteur = new Label("Auteur : ");
        this.lblEditeur = new Label("Éditeur : ");
        this.lblAnnee = new Label("Année : ");
        this.tfTitre = new TextField();
        this.tfAuteur = new TextField();
        this.tfEditeur = new TextField();
        this.tfAnnee = new TextField();
        btnCreer = new Button("Créer");
        add(lblTitre, tfTitre, lblAuteur, tfAuteur, lblEditeur, tfEditeur, lblAnnee, tfAnnee, btnCreer);
    }

}
