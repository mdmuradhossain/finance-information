package io.murad.finance.information.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties
public class ExchangeRateUSD implements Serializable {

    private String result; //"success"
    private String documentation;// "https://www.exchangerate-api.com/docs",
    private String terms_of_use; //"https://www.exchangerate-api.com/terms",
    private String time_last_update_unix; //1642377601,
    private String time_last_update_utc; //"Mon, 17 Jan 2022 00:00:01 +0000",
    private String time_next_update_unix; //1642464001,
    private String time_next_update_utc; //"Tue, 18 Jan 2022 00:00:01 +0000",
    private String base_code; //"USD",

    private ConversionRates conversion_rates;

}
