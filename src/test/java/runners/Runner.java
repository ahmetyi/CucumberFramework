package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//senaryolari calistirabilmek icin
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports"},//HTML formatinda rapor olusturabilmek icin
        features = "src/test/resources/features",//
        glue = "stepdefinitions",
        tags = "@ebay",//calistirmak istedigimiz "feature" ya da "senaryo" nun @tag ismini yaziyoruz.
        dryRun = false //senaryolarimizin icersindeki adimlara ait herhangi bir eksik method varsa, bu methodlari
                      //konsoldan


)


public class Runner {





}
