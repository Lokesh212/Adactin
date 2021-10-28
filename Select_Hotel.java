package Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select_Btn;
	
	@FindBy(id= "continue")
	private WebElement continue_Btn;

	public Select_Hotel(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSelect_Btn() {
		return select_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
	
}
