
public class PrintingDetails {
  public void printing(Travel travel) {
    System.out.print("\n\n--------------------------------\n");
    System.out.print("----------************----------");
    System.out.println("\n          Ticket Details");

    System.out.println("Name             : " + travel.getName());
    System.out.println("Cnic             : " + travel.getCnic());
    System.out.println("Departed city    : " + travel.deptCity);
    System.out.println("Arrival city     : " + travel.arriveCity);
    System.out.println("Ticket number    : " + travel.ticketNum);
    System.out.println("Seat number      : " + travel.seatNum);
    System.out.println("Date             : " + travel.date);
    System.out.print("--------------------------------");
    travel.boardingPass();
    travel.luggageDetails();
    if (travel instanceof Plane | travel instanceof Train) {
      System.out.print("--------------------------------");
    }
    System.out.print("\n----------************----------\n\n\n");
  }

}