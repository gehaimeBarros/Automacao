package br.com.steps;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import br.com.Utils.TestCont;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Gehaime
 *
 */

public class Hooks {

	public AndroidDriver<MobileElement> driver;
	private TestCont testContext;

	public Hooks(TestCont context) {
		testContext = context;
	}

	@Before
	public void before() throws MalformedURLException {
		/*Scheduling*/
		/*Calendar c = Calendar.getInstance();
		Calendar data = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 14);
		c.set(Calendar.MINUTE, 4);
		c.set(Calendar.SECOND, 0);
		data.set(2021, 7, 05);

		Date time = c.getTime();

		final Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					System.out.println("Counting " + " Time: " + new Date());
					new Hooks(testContext).runTestDrive();
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
				t.cancel();
			}

		}, time);
	}*/

	driver = testContext.getDriverFactory().getDriver();
	}

	@SuppressWarnings("deprecation")
	@After
	public void after(Scenario scenario) throws IOException, DocumentException {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		String generatePdfName = scenario.getId().replace(" ", "-");
		Document document = new Document();
		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().getDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File("C:\\Users\\gehai\\Pictures\\Test Success\\" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());

			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("C:\\Users\\gehai\\Pictures\\Test Success"));
			writer.setEncryption(PdfWriter.STRENGTH128BITS, "PDF_Registration_Passed", "Register",
					PdfWriter.AllowCopy | PdfWriter.AllowPrinting);
			document.open();
			document.add(new Paragraph("C:\\Users\\gehai\\Desktop\\Exercicio De Automacao\\src\\main\\java\\br\\com\\steps\\StepsRegister.java\\"+ generatePdfName + ".pdf"));
			document.add(new Paragraph("C:\\Users\\gehai\\Desktop\\Exercicio De Automacao\\src\\main\\java\\br\\com\\steps\\StepLogin.java"+ generatePdfName + ".pdf"));
			document.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, " " + e.getMessage(), "concluded", JOptionPane.INFORMATION_MESSAGE);
			System.out.println(" " + e.getMessage());
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().getDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File("C:\\Users\\gehai\\Pictures\\Test failed" + screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}
		testContext.getDriverFactory().getQuit();
	}

}
