public class marin implements voyage {
    private String idMarin;
    private int nbPlace;

    public marin() {
    }

    public marin(String idMarin, int nbPlace) {
        this.idMarin = idMarin;
        this.nbPlace = nbPlace;
    }

    public String getIdMarin() {
        return idMarin;
    }

    public void setIdMarin(String idMarin) {
        this.idMarin = idMarin;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void reservation() {
        System.out.println("Vous avez réserver une place dans ce bateau ");

    }
}
