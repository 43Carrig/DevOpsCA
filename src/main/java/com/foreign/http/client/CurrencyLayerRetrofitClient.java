package com.foreign.http.client;

import com.foreign.http.client.model.LiveCurrency;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface CurrencyLayerRetrofitClient {

    @GET("live")
    Call<LiveCurrency> getLive(@Query("access_key") String accessKey, @Query("source") String source, @Query("currencies") String currency);
}
