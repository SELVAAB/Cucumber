package com.s;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooksclass {
	
	
	
	@Given("thanos has the infinity stones")
	public void thanos_has_the_infinity_stones() {
	   System.out.println("thanos has the infinity stones");
	}

	@When("thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
	   System.out.println("thanos snaps his fingers");
	}

	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	   System.out.println("half of the living things died");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
