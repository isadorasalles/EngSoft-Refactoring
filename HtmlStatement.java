import java.util.Enumeration;

public class HtmlStatement extends Statement {

    protected String header(Customer aCustomer) { 
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String body(Rental rental) { 
        return rental.getMovie().getTitle()+ ": " + 
                String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    protected String footer(Customer aCustomer) {
        String foot = "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        foot += "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";

        return foot;
    }
}