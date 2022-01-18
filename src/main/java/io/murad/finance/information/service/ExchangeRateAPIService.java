package io.murad.finance.information.service;

import io.murad.finance.information.model.ExchangeRateUSD;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ExchangeRateAPIService {


    private RestTemplate restTemplate;
    private final String API_KEY = "108856a7eb8cc4725efba2b1";

    private final String URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

//    public ExchangeRateUSD getExchangeRateUSD() {
//
//        return restTemplate.getForObject(URL, ExchangeRateUSD.class);
//    }

    public String getExchangeRateUSD() {
        ResponseEntity<String> response = restTemplate.getForEntity(URL, String.class);
        return response.getBody();
    }
}
