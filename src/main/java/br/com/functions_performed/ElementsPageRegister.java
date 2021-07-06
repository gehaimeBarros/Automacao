package br.com.functions_performed;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.Utils.Constantes;
import br.com.Utils.Driver;
import br.com.Utils.Excell;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * 
 * @author Gehaime
 *
 */

public class ElementsPageRegister {

	@SuppressWarnings("rawtypes")
	private TouchAction actions = new TouchAction((PerformsTouchActions) Driver.driver);
	private WebDriverWait wait = new WebDriverWait(Driver.driver, 50);

	public ElementsPageRegister(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewAdvantage")
	private static WebElement pageValidation;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement new1;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement menu;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private static WebElement newAccount;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private static WebElement user;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]")
	private static WebElement email;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private static WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]")
	private static WebElement confirmPassword;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]")
	private static WebElement userName;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]")
	private static WebElement surname;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]")
	private static WebElement telephone;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private static WebElement country;
	@FindBy(how = How.ID, using = "android:id/text1")
	private static WebElement selectCountry;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private static WebElement state;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private static WebElement address;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	private static WebElement city;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private static WebElement zipCode;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private static WebElement register;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement Options;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement Answer1;

	public String getPageValidation() {
		System.out.println("\t====SUCCESS = ADVANTAGE SHOP HOMEPAGE USER====");
		return pageValidation.getText();
		
	}
	
	public String getResp1() {
		return Answer1.getText();
	}

	public void getPageActions() {
		new1.click();
		menu.click();
		newAccount.click();
	}

	public void getUserInformation() throws Exception {
		Excell.setExcelFile(Constantes.caminho + Constantes.arquivo, "Planilha1");
		user.click();
		user.sendKeys(Excell.getCellData(0, 1));
		email.click();
		email.sendKeys(Excell.getCellData(1, 1));
		password.click();
		password.sendKeys(Excell.getCellData(2, 1));
		confirmPassword.click();
		confirmPassword.sendKeys(Excell.getCellData(3, 1));
		actions.press(PointOption.point(1068, 1120)).moveTo(PointOption.point(1071, 253)).release().perform();
		userName.click();
		userName.sendKeys(Excell.getCellData(4, 1));
		surname.click();
		surname.sendKeys(Excell.getCellData(5, 1));
		telephone.click();
		telephone.sendKeys(Excell.getCellData(6, 1));
		country.click();
		selectCountry.click();
		state.click();
		state.sendKeys(Excell.getCellData(8, 1));
		address.click();
		address.sendKeys(Excell.getCellData(9, 1));
		city.click();
		city.sendKeys(Excell.getCellData(10, 1));
		zipCode.click();
		zipCode.sendKeys(Excell.getCellData(11, 1));
		actions.press(PointOption.point(1056, 1771)).moveTo(PointOption.point(1065, 992)).release().perform();
	}

	public void getRegister() {
		wait.until(ExpectedConditions.elementToBeClickable(register)).click();
	}

	public void getOptions() {
		Options.click();
	}
}