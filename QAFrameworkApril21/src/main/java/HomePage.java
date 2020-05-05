import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */

/**
 * @author hchatha
 *
 */
public class HomePage extends BasePage {
	
	private By header = By.className("private-page__title");

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
		public WebElement getHeader() {
			return getElement(header);
		}
		
		public String getHomePaegTitle() {
			return getPagetitle();
		}
		
		public String getHomePageHeader() {
			return getPageHeader(header);
		}
	}


