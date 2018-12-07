package worldexplorer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import worldexplorer.entity.rest.Quote;

public class RestClient {

    @Autowired
    RestTemplate restTemplate;

    public Quote getQuote(){
        return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }
}
