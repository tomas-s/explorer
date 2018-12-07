package worldexplorer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import worldexplorer.config.SpringConfigTest;
import worldexplorer.entity.rest.Quote;
import worldexplorer.rest.RestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { SpringConfigTest.class })
public class WorldExplorerApplicationTests {

	@Autowired
	RestClient restClient;

	@Test
	public void callRest(){
		Quote quote = restClient.getQuote();
		System.out.println(quote);

	}


}
