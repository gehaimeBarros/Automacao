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
//import io.appium.java_client.PerformsTouchActions;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Gehaime
 *
 */

public class ElementsPageLogin {

	//private TouchAction actions = new TouchAction((PerformsTouchActions) Driver.driver);
	private WebDriverWait wait = new WebDriverWait(Driver.driver, 50);

	public ElementsPageLogin(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewAdvantage")
	private static WebElement pageValidation;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement menu;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement login;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private static WebElement Options;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private static WebElement Answer1;
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private static WebElement buttonLogin;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private static WebElement userLogin;
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private static WebElement passwordLogin;

	public void getUserLogin() throws Exception {
		Excell.setExcelFile(Constantes.caminho + Constantes.arquivo, "Planilha1");
		menu.click();
		login.click();
		userLogin.click();
		userLogin.sendKeys(Excell.getCellData(0, 1));
		passwordLogin.click();
		passwordLogin.sendKeys(Excell.getCellData(2, 1));
		wait.until(ExpectedConditions.elementToBeClickable(buttonLogin)).click();

	}

	public String getPageValidation() {
		System.out.println("\t====SUCCESS = ADVANTAGE SHOP HOMEPAGE USER====");
		return pageValidation.getText();

	}

	public String getResp1() {
		return Answer1.getText();
	}

	public void getOptions() {
		Options.click();
	}

}
