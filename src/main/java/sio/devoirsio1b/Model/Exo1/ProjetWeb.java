package sio.devoirsio1b.Model.Exo1;

public class ProjetWeb extends Projet {

    private boolean responsive;
    private int nbPages;

    public ProjetWeb(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbPages, boolean responsive) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbPages = nbPages;
        this.responsive = responsive;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public boolean isResponsive() {
        return responsive;
    }

    public void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

    @Override
    public String getInfos() {
        return super.getInfos()
                + " Nombre de pages : " + nbPages
                + " Responsive : " + (responsive ? "Oui" : "Non");
    }

    @Override
    public double calculerMontant() {
        return super.calculerMontant() * (1 + (responsive ? 0.2 : 0));
    }
}

