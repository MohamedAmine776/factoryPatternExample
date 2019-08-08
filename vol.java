public class vol implements voyage {
    private String idVol;
    private int nbPlace;

    public vol() {
    }

    public vol(String idVol, int nbPlace) {
        this.idVol = idVol;
        this.nbPlace = nbPlace;
    }

    public String getIdVol() {
        return idVol;
    }

    public void setIdVol(String idVol) {
        this.idVol = idVol;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void reservation() {
        System.out.println("Vous avez réserver une place dans ce vol ");

    }
}
