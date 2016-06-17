package src.copy;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class attdStep {
	double result;
	@Given("^user enter an \"([^\"]*)\"$")
	public void user_enter_an(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    RpnCalculator rpn1 = new RpnCalculator();
	    result= rpn1.simpleAdd(arg1);
		//RpnCalculator rpn = new RpnCalculator();
	    //result= rpn.simpleAdd(arg1);
	}

	@Then("^result should be \"([^\"]*)\"$")
	public void result_should_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals(result,Double.parseDouble(arg1),0.0);
	   
	  
	}



}
