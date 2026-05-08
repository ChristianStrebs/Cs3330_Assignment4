package edu.oop.guild.model;

import edu.oop.guild.creature.Creature;
import java.util.Objects;

public class DeliveryPlan {

    private DeliveryRequest request;
    private Creature courier;
    private String sealedLabel;
    private int priceInCoins;
    // Constructs a valid Delivery plan by checking if values are NULL
    public DeliveryPlan(DeliveryRequest request, Creature courier, String sealedLabel, int priceInCoins) {
        Objects.requireNonNull(request, "request must not be null");
        Objects.requireNonNull(courier, "courier must not be null");
        Objects.requireNonNull(sealedLabel, "sealedLabel must not be null");
        // Making sure coins are not less than 0
        if (priceInCoins < 0) {
            throw new IllegalArgumentException("priceInCoins cannot be negative, got: " + priceInCoins);
        }
        this.request = request;
        this.courier = courier;
        this.sealedLabel = sealedLabel;
        this.priceInCoins = priceInCoins;
    }
    // Getters
    public DeliveryRequest getRequest() {
        return request;
    }

    public Creature getCourier() {
        return courier;
    }

    public String getSealedLabel() {
        return sealedLabel;
    }

    public int getPriceInCoins() {
        return priceInCoins;
    }
    // Returns a string containing all of the details about the courier,label, and price
    public String summary() {
        return courier.name() + " delivers " + sealedLabel + " for " + priceInCoins + " coins";
    }
}

