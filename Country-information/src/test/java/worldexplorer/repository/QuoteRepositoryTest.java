package worldexplorer.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import worldexplorer.entity.Quote;
import worldexplorer.entity.Value;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class QuoteRepositoryTest {

    @Autowired
    private ValueRepository vr;

    @Autowired
    private QuoteRepository qr;

    @Autowired
    TestEntityManager em;


    private Quote quote = new Quote("String");
    private Value value = new Value("some value");

    @Before
    public void setUp() throws Exception {
        vr.saveAndFlush(value);
    }

    @Test
    public void add_quote_repository(){
        System.out.println("start method");
        qr.assignValueToQuote(quote,value);
        final List<Value> allValue = vr.findAll();
        final List<Quote> all = qr.findAll();
        System.out.println(all);
    }

}