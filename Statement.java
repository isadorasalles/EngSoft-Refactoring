import java.util.Enumeration;

public abstract class Statement {
  protected abstract String header(Customer aCustomer);
  protected abstract String body(Rental rental);
  protected abstract String footer(Customer aCustomer);

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = header(aCustomer);

    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        //show figures for this rental
        result += body(each);
    }

    //add footer lines
    result += footer(aCustomer);

    return result;
  }
}