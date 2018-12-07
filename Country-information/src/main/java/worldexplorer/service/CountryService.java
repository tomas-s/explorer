package worldexplorer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import worldexplorer.entity.rest.Quote;
import worldexplorer.repository.ValueRepository;
import worldexplorer.rest.RestClient;

import javax.transaction.Transactional;

@Service
public class CountryService {

    @Autowired
    private ValueRepository vr;

    @Autowired
    private RestClient restClient;

    @Transactional
    public void getCountryData(){
        Quote quote = restClient.getQuote();
        //je potrebne namapovat objekt
//
//        vr.saveAndFlush(quote.getValue());
    }

}
