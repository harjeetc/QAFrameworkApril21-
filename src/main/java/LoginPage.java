import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 */

/**
 * @author hchatha
 *		// so far we have looed at abstraction, inheritance, encapsulation . 
 *		super keyword, constructors, this keyword, overriding .
 */
public class LoginPage extends BasePage {
	//encapsulation - declaring variables private . 
	//page locators
	private By emailID;
	private By password;
	private By loginButton;
	private By header;
	private By exampleforGettersandsetters;

	public LoginPage(WebDriver driver) {
		super(driver);
		emailID = By.id("username");
		password = By.id("password");
		loginButton = By.id("loginBtn");
		header = By.xpath("//i18n-string[@data-key='login.signupLink.text'");
		exampleforGettersandsetters = By.id("username");

	}
	//public getters
	/**
	 * @return the emailID
	 */
	public WebElement getEmailID() {
		return getElement(emailID);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		return getPagetitle();
	}

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String userName, String Passwrd) throws InterruptedException {
	//	getEmailID().click();
		Thread.sleep(3000);
		getEmailID().sendKeys(userName);
		getPassword().sendKeys(Passwrd);
		getLoginButton().click();
		
		// should land on the next page object
		return getInstance(HomePage.class);
	}
	
	// method over loading when we use the same method with parameters
	public void doLogin() {
		getEmailID().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		// should land on the next page object
		
	}
	//negative test case 
//	userCred: harj500@aol.com
	public void doLogin(String userCred) {
		if(userCred.contains("userName")) {
			getEmailID().sendKeys(userCred.split(":")[1].trim());
		}else if(userCred.contains("password")) {
				getPassword().sendKeys(userCred.split(":")[1].trim());
			}
			getLoginButton().click();
		}
	public By getExampleforGettersandsetters() {
		return exampleforGettersandsetters;
	}

	
			
		
		// should land on the next page object
		
	}
	
	

