import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/features")
public class RunCucunberTest {
    public static void main(String[] args){
        cucumber.api.cli.Main.main(args);
    }
}
