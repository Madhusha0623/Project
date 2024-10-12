package org.stepdefinition;
import org.base.BaseClass;
import org.base.ScentPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scent extends BaseClass {
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
	    windowsMaximize();
	}

	@When("To launch the url of SCENT-ArtsasaUser")
	public void to_launch_the_url_of_SCENT_ArtsasaUser() {
		launchUrl("https://scentarts.ae/");
	}

	@When("I click on the About Us button")
	public void i_click_on_the_About_Us_button() {
	    ScentPojo s = new ScentPojo();
        clickBtn(s.getAboutus());
	}
	
	@When("I scroll to the Areas of Scenting section")
	public void i_scroll_to_the_Areas_of_Scenting_section() {
		ScentPojo s = new ScentPojo();
	    scrollToElement(s.getAreasOfScenting());
	}

	@When("I click on the {string},{string},{string} Areas")
	public void i_click_on_the_Areas(String string, String string2, String string3) {
		ScentPojo s = new ScentPojo();
		clickBtn(s.getArea1());
		clickBtn(s.getArea2());
		clickBtn(s.getArea3());
		
	}
	@Then("close the browser")
	public void close_the_browser() {
	    
	}





}
