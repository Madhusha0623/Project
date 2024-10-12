package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.BaseClass;

public class ScentPojo extends BaseClass{
	
	public ScentPojo() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//a[text()='About Us']")
	public WebElement aboutus;
	
	@FindBy(xpath = "//h2[text()='AREAS OF SCENTING']")
	public WebElement areasOfScenting;
	
	@FindBy(id ="elementor-tab-title-2361")
	public WebElement area1;
	
	@FindBy(id ="elementor-tab-title-4431")
	public WebElement area2;
	
	@FindBy(id ="elementor-tab-title-2101")
	public WebElement area3;

	public WebElement getArea1() {
		return area1;
	}

	public WebElement getArea2() {
		return area2;
	}

	public WebElement getArea3() {
		return area3;
	}

	public WebElement getAreasOfScenting() {
		return areasOfScenting;
	}

	public WebElement getAboutus() {
		return aboutus;
	}

	
	

}
