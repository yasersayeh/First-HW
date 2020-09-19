package fallProject2020;

import static org.junit.Assert.assertTrue;

import Classes.Checkout;
import io.cucumber.java.en.*;

public class CheckOutSteps {

	
	private int Bprice =0, Aprice=0 , total=0 ;
	 String item ="" , banana= "banana" , apple = "apple";
	
	Checkout checkout;
		@Given("the price of a {string} is {int}")
		public void thePriceOfAIs(String item, int price) {
		    // Write code here that turns the phrase above into concrete actions
			
		this.item = item;
		if (item.equals(apple))
			Aprice = price;
	 
		if (item.equals(banana)) Bprice = price;
		
		
		    //throw new io.cucumber.java.PendingException();
		    
		}


		@When("I checkout {int} {string}")
		public void iCheckout(Integer count, String item2) {
		    // Write code here that turns the phrase above into concrete actions
			 int price2=0 ;
			 
			
			checkout = new Checkout();
			 if (item2.equals(banana)) {
			  price2 = checkout.calc(count,Bprice);}
			 
			 else price2 = checkout.calc(count,Aprice);
			 total+= price2;
		    //throw new io.cucumber.java.PendingException();
		}
		
		
		
		@Then("the total price should be {int}")
		public void theTotalPriceShouldBe(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
			
			assertTrue(total == int1);
			System.out.println("apple ="+Aprice+ "\t"+"banana="+Bprice);
			
			System.out.println("total ="+ total);
			System.out.println("int1="+int1);
			
			System.out.println();

			
		 //   throw new io.cucumber.java.PendingException();
		}
		
		
		

		
		
	
		
		


}
