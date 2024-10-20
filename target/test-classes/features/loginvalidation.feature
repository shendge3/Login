Feature: Validate New account API

  Scenario Outline: Validate account API
    Given Payload with "VIVEK"  "SHENDGE" "AMSRs@ASDF.COM" "1234242340"
    When user calls "/api/ecom/auth/register" with POST http request
   
