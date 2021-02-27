
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber/html",//for html as file name index is generated we need not specify the filename
                "json:target/cucumber/json/mytest.json"},
        glue = "com.qa",
        features = "classpath:features"
)

public class TestRunner {

}