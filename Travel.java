
import java.time.LocalDate;

public abstract class Travel implements TicketInterface {
    private String name = "Ali";
    private int cnic = 35202;
    int ticketNum = 1;
    String deptCity = "Lahore";
    String arriveCity = "Peshawar";
    int seatNum = 1;
    double luggageWeight;
    int luggageIdentification;

    public Travel() {
    }

    LocalDate date = LocalDate.now();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnic() {
        return this.cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public abstract void luggageDetails();

}
