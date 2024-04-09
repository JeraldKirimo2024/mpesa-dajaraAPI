package com.alex.mpesadaraja.dtos.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class StkCallbackBody {
    @JsonProperty("stkCallback")
    private StkCallBack stkCallback;

    @SneakyThrows
    @Override
    public String toString() {

        return new ObjectMapper().writeValueAsString(this);
    }

    // Getters and setters
}