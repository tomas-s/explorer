package worldexplorer.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import worldexplorer.config.SpringConfigTest;
import worldexplorer.entity.Value;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class ValueRepositoryTest {

    @Autowired
    private ValueRepository vr;

    private Value value1;

    @Before
    public void setUp() throws Exception {
        value1 = new Value("test");
    }

    @Test
    public void addValue(){
        vr.saveAndFlush(value1);
    }
}