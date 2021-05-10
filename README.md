# spring5-geocoding-service
Spring geocoding service with using OpenCage API<br>

## Getting Started

Geocoding Service API is a Spring Boot application built using Maven. You can build a jar file and run it from the command line (JDK 11 is required):

```bash
git clone https://github.com/uniloftsky/spring5-geocoding-service
cd spring5-geocoding-service
./mvnw package
java -jar target/*.jar
```

You can then access api here: [http://localhost:8080/api/geocode?q=REQUEST](http://localhost:8080/api/geocode?q=REQUEST)
<br>

## Usage
Input url:
```http request
http://localhost:8080/api/geocode?q=REQUEST
```
REQUEST can be replaced by address or geometry(reverse geocoding)<br>
Addresses need to be encoded. For example:<br>
Original: 
```
Taras Shevchenko, Volodymyrska Street, Центр, Kyiv, 01046, Ukraine
```
Encoded:
```
Taras%20Shevchenko%2C%20Volodymyrska%20Street%2C%20%D0%A6%D0%B5%D0%BD%D1%82%D1%80%2C%20Kyiv%2C%2001046%2C%20Ukraine
```
Request with address. Input:
```http request
http://localhost:8080/api/geocode?q=Taras%20Shevchenko%2C%20Volodymyrska%20Street%2C%20%D0%A6%D0%B5%D0%BD%D1%82%D1%80%2C%20Kyiv%2C%2001046%2C%20Ukraine
```
Output:
```json
{
    "results": [
        {
            "formatted": "Taras Shevchenko, Volodymyrska Street, Центр, Kyiv, 01046, Ukraine",
            "geometry": {
                "lat": 50.4417201,
                "lng": 30.5129543
            }
        },
        {
            "formatted": "Kyiv, Kyiv City, Ukraine",
            "geometry": {
                "lat": 50.45466,
                "lng": 30.5238
            }
        }
    ]
}
```
Request with geometry. Input:
```http request
http://localhost:8080/api/geocode?q=51.952659%2C7.632473
```
Output:
```json
{
    "results": [
        {
            "formatted": "Friedrich-Ebert-Straße 7, 48153 Münster, Germany",
            "geometry": {
                "lat": 51.9526599,
                "lng": 7.632473
            }
        }
    ]
}
```
