package com.alex.mpesadaraja.dtos.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class StkCallBack {
    @JsonProperty("MerchantRequestID")
    private String merchantRequestId;

    @JsonProperty("CheckoutRequestID")
    private String checkoutRequestId;

    @JsonProperty("ResultCode")
    private String resultCode;

    @JsonProperty("ResultDesc")
    private String resultDesc;

    @JsonProperty("CallbackMetadata")
    private CallbackMetadata callbackMetadata;

    @SneakyThrows
    @Override
    public String toString() {

        return new ObjectMapper().writeValueAsString(this);
    }

}