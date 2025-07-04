package com.FawryRise.Journey.model.product;

import java.util.Date;

public interface Expirable {
    Date getExpiryDate();
    boolean isExpired();
}
