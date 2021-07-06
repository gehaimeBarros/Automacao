package br.com.Utils;

import br.com.functions_performed.ElementsPageRegister;
import br.com.functions_performed.ElementsPageLogin;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Gehaime
 *
 */

public class PageObjectManager {
	public  AndroidDriver<MobileElement> driver;
	
	private ElementsPageRegister Cadastro;
	private ElementsPageLogin Login;
	
	public PageObjectManager(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public ElementsPageRegister getCadastro() {
		return (Cadastro == null) ? Cadastro = new ElementsPageRegister(driver) : Cadastro;
	}
	
	public ElementsPageLogin getLogin() {
		return (Login == null) ? Login = new ElementsPageLogin(driver) : Login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cadastro == null) ? 0 : Cadastro.hashCode());
		result = prime * result + ((Login == null) ? 0 : Login.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
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
		PageObjectManager other = (PageObjectManager) obj;
		if (Cadastro == null) {
			if (other.Cadastro != null)
				return false;
		} else if (!Cadastro.equals(other.Cadastro))
			return false;
		if (Login == null) {
			if (other.Login != null)
				return false;
		} else if (!Login.equals(other.Login))
			return false;
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		return true;
	}
	
}