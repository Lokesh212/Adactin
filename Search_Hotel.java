package Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement room_Type;
	
	@FindBy(id= "room_nos")
	private WebElement no_of_Rooms;
	
	@FindBy(id= "datepick_in")
	private WebElement checkIn;
	
	@FindBy(id= "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id= "adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id= "child_room")
	private WebElement childPerRoom;
	
	@FindBy(id= "Submit")
	private WebElement search_Btn;

	public Search_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNo_of_Rooms() {
		return no_of_Rooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}
	
	
	

}
