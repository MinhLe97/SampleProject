package integration;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/integration/resources/features/guru.feature" ,
        plugin = {"json:target/cucumber_json/cucumber.json"} )

public class GuruWebTest {
}
