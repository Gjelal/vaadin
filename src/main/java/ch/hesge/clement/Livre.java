package ch.hesge.clement;

import java.util.Date;

public class Livre {

    private String titre;
    private String editeur;
    private String auteur;
    private Date annee;

    public Livre(String titre, String editeur, String auteur, Date annee) {
        this.titre = titre;
        this.editeur = editeur;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }
}
