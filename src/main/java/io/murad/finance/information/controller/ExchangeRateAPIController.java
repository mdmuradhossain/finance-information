package io.murad.finance.information.controller;

import io.murad.finance.information.model.ExchangeRateUSD;
import io.murad.finance.information.service.ExchangeRateAPIService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController()
@RequestMapping("/api/exchange-rate")
public class ExchangeRateAPIController {

    private ExchangeRateAPIService exchangeRateAPIService;

//    @GetMapping
//    public ResponseEntity<ExchangeRateUSD> getExchangeRate() {
//        ExchangeRateUSD response = exchangeRateAPIService.getExchangeRateUSD();
//        return new ResponseEntity<>(response, HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<String> getExchangeRate() {
       String response = exchangeRateAPIService.getExchangeRateUSD();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
