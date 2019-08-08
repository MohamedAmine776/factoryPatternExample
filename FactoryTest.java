public class FactoryTest {
    public static void main(String [] args){
       voyageFactory factory = new voyageFactory();
       // get an object of bus and call its reservation method.
        voyage voyage1 = factory.getVoyage("bus");
        // call reservation method of bus
        voyage1.reservation();
        // get an object of vol and call its reservation method.
        voyage voyage2 = factory.getVoyage("vol");
        // call reservation method of vol
        voyage2.reservation();
        // get an object of marin and call its reservation method.
        voyage voyage3 = factory.getVoyage("marin");
        // call reservation method of marin
        voyage3.reservation();

    }
}
