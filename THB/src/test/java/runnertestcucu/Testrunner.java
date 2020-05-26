package runnertestcucu;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)   
@Cucumber.Options(features = "src/test/resources/Cucumbertest.feature")  
public class Testrunner {

}
