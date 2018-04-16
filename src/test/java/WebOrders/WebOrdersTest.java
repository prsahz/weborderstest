package WebOrders;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/Destination"},
        features = { "src/test/resources/" }
        )
public class WebOrdersTest {
}
