package io.murad.finance.information.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ExchangeRateUSD {
    private String result; //"success"
    private String documentation;// "https://www.exchangerate-api.com/docs",
    private String termsOfUse; //"https://www.exchangerate-api.com/terms",
    private String timeLastUpdateUnix; //1642377601,
    private String timeLastUpdateUtc; //"Mon, 17 Jan 2022 00:00:01 +0000",
    private String timeNextUpdateUnix; //1642464001,
    private String timeNextUpdateUtc; //"Tue, 18 Jan 2022 00:00:01 +0000",
    private String baseCode; //"USD",
}
