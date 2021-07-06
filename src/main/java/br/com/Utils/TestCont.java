package br.com.Utils;

import java.net.MalformedURLException;

/**
 * @author Gehaime
 */
public class TestCont {
	
	private Driver driverManager;
	private PageObjectManager pageObjectManager;

	public TestCont() throws MalformedURLException {
		driverManager = new Driver();
		pageObjectManager = new PageObjectManager(Driver.Iniciar());

	}

	public  Driver getDriverFactory() {
		return driverManager;

	}

	public PageObjectManager getPageObjectFactory() {
		return pageObjectManager;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverManager == null) ? 0 : driverManager.hashCode());
		result = prime * result + ((pageObjectManager == null) ? 0 : pageObjectManager.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestCont other = (TestCont) obj;
		if (driverManager == null) {
			if (other.driverManager != null)
				return false;
		} else if (!driverManager.equals(other.driverManager))
			return false;
		if (pageObjectManager == null) {
			if (other.pageObjectManager != null)
				return false;
		} else if (!pageObjectManager.equals(other.pageObjectManager))
			return false;
		return true;
	}

}
