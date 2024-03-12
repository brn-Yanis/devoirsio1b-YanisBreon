package sio.devoirsio1b.Model.Exo1;

public class ProjetMobile extends Projet {

    private int nbEcrans;

    public ProjetMobile(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbEcrans) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbEcrans = nbEcrans;
    }

    public int getNbEcrans() {
        return nbEcrans;
    }

    public void setNbEcrans(int nbEcrans) {
        this.nbEcrans = nbEcrans;
    }

    @Override
    public String getInfos() {
        return super.getInfos()
                + " Nombre d'écrans : " + nbEcrans;
    }

    @Override
    public double calculerMontant() {
        return super.calculerMontant() * (1 + nbEcrans * 0.1);
    }
}

