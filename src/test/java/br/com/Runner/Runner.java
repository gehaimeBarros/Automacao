package br.com.Runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * @author Gehaime
 * 
 *   @package：${package_name}，@class-name：${file_name}   
 *   @copyright       Copyright:   2020-2020
 *   @creator         Your name <br/>   
 *   @create-time   ${date}   ${time}   
 *   @revision         $$Id: 1.0
 * 
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\gehai\\Desktop\\Exercicio De Automacao\\Features",
		glue = "br.com.steps",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\gehai\\Pictures\\Test Success\\Successful_User_Registration.html"},
        //plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		tags = {"@Cadastro_Sucesso", "@Login_Sucesso"}

                        
		)
public class Runner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("C:\\Users\\gehai\\Desktop\\Exercicio De Automacao\\extension-config.xml"));
	}
}