import java.util.Enumeration;

public class TextStatement extends Statement {

    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String body(Rental rental) { 
        return "\t" + rental.getMovie().getTitle()+ "\t" + 
            String.valueOf(rental.getCharge()) + "\n";
    }

    protected String footer(Customer aCustomer) {
        String foot = "Amount owed is " + 
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        foot += "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";

        return foot;
    }
}
