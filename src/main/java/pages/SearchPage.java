package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	private WebDriver driver;
	
	private By productImages = By.xpath("//img[@class='img-responsive']");
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean areProductsDisplayed() {
		return driver.findElements(productImages).size() > 0;
	}
}
