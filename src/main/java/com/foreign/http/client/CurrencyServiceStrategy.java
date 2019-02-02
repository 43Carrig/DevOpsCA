package com.foreign.http.client;

import java.math.BigDecimal;

public interface CurrencyServiceStrategy {

    BigDecimal getLiveCurrency(String currencyFrom, String currencyTo) throws Exception;
}
