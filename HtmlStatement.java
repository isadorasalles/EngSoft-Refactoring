import java.util.Enumeration;

public class HtmlStatement extends Statement {

    private String header(Customer aCustomer) { // cabeçalho
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    private String body(Rental rental) { // corpo do texto
        return rental.getMovie().getTitle()+ ": " + 
                String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    private String footer(Customer aCustomer) {
        String foot = "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        foot += "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";

        return foot;
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = header(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += body(each);
        }
        //add footer lines
        result += footer(aCustomer);

        return result;
    }
}