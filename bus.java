public class bus implements voyage {
    private String idBus ;
    private int nbPlace;

    public bus() {
    }

    public bus(String idBus, int nbPlace) {
        this.idBus=idBus;
        this.nbPlace = nbPlace;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public void reservation() {
           System.out.println("Vous avez réserver une place dans ce bus ");
    }
}
