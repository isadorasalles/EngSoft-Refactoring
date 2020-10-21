import java.util.Enumeration;

public class TextStatement extends Statement {

    private String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String body(Rental rental) { 
        return "\t" + rental.getMovie().getTitle()+ "\t" + 
            String.valueOf(rental.getCharge()) + "\n";
    }

    private String footer(Customer aCustomer) {
        String foot = "Amount owed is " + 
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        foot += "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";

        return foot;
    }

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
