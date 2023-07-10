package fr.ippon.mill.farmer.infrastructure.primary;

import java.time.Instant;

public class RegisterCerealRequest {
    private String cereal;
    private String farmerId;
    private Instant harvestDay;
    private double  quantity;
}
