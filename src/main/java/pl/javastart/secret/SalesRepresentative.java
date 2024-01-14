package pl.javastart.secret;

import pl.javastart.secret.Offer;
import pl.javastart.task.Config;

public class SalesRepresentative {
    Config config = new Config();

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }
}
