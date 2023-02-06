
public class Plane extends Travel {

    int planeNum = 10;
    String gateNum = "ABC 786";

    public Plane() {
        super();

    }

    @Override
    public void boardingPass() {
        System.out.println("\n          Boarding Pass");
        System.out.println("Gate Number      : " + gateNum);
        System.out.println("Plane Number     : " + planeNum);

    }

    @Override
    public void luggageDetails() {
        System.out.println("\n          Luggage Details");
        System.out.println("Weight           : " + luggageWeight + " Kgs");
        System.out.println("luggage Id       : " + luggageIdentification);

    }

}
