public class voyageFactory {
    public voyage getVoyage(String type){
        if(type==null)
            return null ;
        else if(type.equalsIgnoreCase("bus"))
            return new bus();
        else if (type.equalsIgnoreCase("vol"))
            return new vol();
        else if(type.equalsIgnoreCase("marin"))
            return new marin();
        return null;
    }
}
