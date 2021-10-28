package Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id= "first_name")
	private WebElement first_Name;
	
	@FindBy(id= "last_name")
	private WebElement last_Name;
	
	@FindBy(id= "address")
	private WebElement address;
	
	@FindBy(id= "cc_num")
	private WebElement credit_Card_No;
	
	@FindBy(id= "cc_type")
	private WebElement credit_Card_Type;
	
	@FindBy(id= "cc_exp_month")
	private WebElement expiry_Month;
	
	@FindBy(id= "cc_exp_year")
	private WebElement expiry_Year;
	
	@FindBy(id= "cc_cvv")
	private WebElement cvv_No;
	
	@FindBy(id= "book_now")
	private WebElement booknow_Btn;

	public Book_Hotel(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_Card_No() {
		return credit_Card_No;
	}

	public WebElement getCredit_Card_Type() {
		return credit_Card_Type;
	}

	public WebElement getExpiry_Month() {
		return expiry_Month;
	}

	public WebElement getExpiry_Year() {
		return expiry_Year;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}

	public WebElement getBooknow_Btn() {
		return booknow_Btn;
	}
	

}
