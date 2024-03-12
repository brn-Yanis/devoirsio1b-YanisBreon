package sio.devoirsio1b.Model.Exo1;

public class Projet implements Comparable {

    private int idProjet;
    private String nomProjet;
    private int duree;
    private double tauxHoraire;

    public Projet(int idProjet, String nomProjet, int duree, double tauxHoraire) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public String getInfos() {
        return " Numéro : " + idProjet
                + " Nom :  " + nomProjet
                + " Durée : " + duree + " jours"
                + " Taux horaire : " + tauxHoraire + " €";
    }

    public double calculerMontant() {
        return duree * tauxHoraire;
    }

    @Override
    public int compareTo(Projet projet) {
        return nomProjet.compareTo(projet.getNomProjet());
    }
}

