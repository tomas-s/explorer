package worldexplorer.repository.custom_operations;

import org.springframework.beans.factory.annotation.Autowired;
import worldexplorer.entity.Quote;
import worldexplorer.entity.Value;

import javax.persistence.EntityManager;

public class QuoteOperationImpl implements QuoteOperation {

    @Autowired
    private EntityManager em;

    public QuoteOperationImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void assignValueToQuote(Quote quote, Value value) {
        quote.getValue().add(value);
        value.setQuote(quote);
        em.persist(value);
        em.persist(quote);
        em.flush();
    }
}
