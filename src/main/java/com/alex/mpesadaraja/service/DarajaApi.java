package com.alex.mpesadaraja.service;

import org.springframework.http.ResponseEntity;

import com.alex.mpesadaraja.dtos.callback.StkCallbackRequest;

public interface DarajaApi {

    String getAccessToken();

    ResponseEntity<String> sendSTK(String phoneNo, int amount);

    void callback(StkCallbackRequest stkCallbackRequest) throws Exception;

}