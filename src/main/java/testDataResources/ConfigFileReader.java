package testDataResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Gehaime
 */
public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "C:\\Users\\gehai\\Desktop\\BDDAppium\\src\\main\\java\\testDataResources\\Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Arquivo de propriedades não encontrado no caminho: " + propertyFilePath);
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException(
					"Caminho do driver não especificado no arquivo Configuration.properties para a chave: driverPath\r\n"
							+ "");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException("Não é possível analisar o valor:" + implicitlyWait + "em longo");
			}
		}
		return 30;
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException(
					"O URL do aplicativo não foi especificado no arquivo Configuration.properties para a chave: url");
	}

/*	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			//return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			//return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			//return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
*/
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public String getTestDataResourcePath() {
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"O caminho do recurso de dados de teste não foi especificado no arquivo Configuration.properties para a chave: testDataResourcePath\r\n" + 
					"");
	}

}
