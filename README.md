## MicroServices:
----------------------------------------
| Services | Port |
| -------- | ----- |
| currency_api_gateway | 80 |
| currency_naming_server | 5000 |
| currency_config_server | 8888 |
| currency_exchange_service | 8110 |
| currency_conversion_service | 8100 |


## URLS
------------
```sh
http://localhost:8110/currency-exchange/from/USD/to/INR
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
http://localhost/currency-conversion/from/USD/to/INR/quantity/30 (Using API Gateway)
```