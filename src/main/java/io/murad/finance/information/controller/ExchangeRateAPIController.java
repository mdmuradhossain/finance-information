package io.murad.finance.information.controller;

import io.murad.finance.information.model.ExchangeRateUSD;
import io.murad.finance.information.service.ExchangeRateAPIService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("/api/exchange-rate")
public class ExchangeRateAPIController {

    private ExchangeRateAPIService exchangeRateAPIService;

    @GetMapping
    public ResponseEntity<ExchangeRateUSD> getExchangeRate() {
        ExchangeRateUSD response = exchangeRateAPIService.getExchangeRateUSD();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
