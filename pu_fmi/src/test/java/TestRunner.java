import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",monochrome= true,plugin= {"pretty","html:target/cucumber-reports"})
public class TestRunner {

}
