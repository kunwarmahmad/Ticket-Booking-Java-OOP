
public class Train extends Travel {
    int gateNum = 12;
    int trainNum = 786;

    public Train() {
        super();

    }

    @Override
    public void boardingPass() {
        System.out.println("\n          Boarding Pass");
        System.out.println("Gate Number      : " + gateNum);
        System.out.println("Train Number     : " + trainNum);

    }

    @Override
    public void luggageDetails() {
        System.out.println("\n          Luggage Details");
        System.out.println("Weight           : " + luggageWeight + " Kgs");
        System.out.println("luggage Id       : " + luggageIdentification);
    }

}
