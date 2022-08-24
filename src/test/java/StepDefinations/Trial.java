package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Trial {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println(1);

	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    System.out.println(1);
	}

	@When("I complete action")
	public void i_complete_action() {
	    System.out.println(1);
	}


}
