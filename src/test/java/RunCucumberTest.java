
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
    @CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-reports", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
            "json:target/cucumber-html-reports/cucumber.json","rerun:target/failed_scenarios.txt" },
                    monochrome = true,
                    glue = "stepdefinitions",
                    features = "src/test/java/features")
    public class RunCucumberTest extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }

    }
