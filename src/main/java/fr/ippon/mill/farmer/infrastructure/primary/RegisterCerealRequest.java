package fr.ippon.mill.farmer.infrastructure.primary;

import java.time.Instant;

public class RegisterCerealRequest {
    private String cereal;
    private String farmerId;
    private Instant harvestDay;
    private double quantity;

    public String getCereal() {
        return cereal;
    }

    public void setCereal(String cereal) {
        this.cereal = cereal;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public Instant getHarvestDay() {
        return harvestDay;
    }

    public void setHarvestDay(Instant harvestDay) {
        this.harvestDay = harvestDay;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
