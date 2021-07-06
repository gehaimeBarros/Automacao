package br.com.steps;

import org.junit.Assert;

import br.com.Utils.Constantes;
import br.com.Utils.Excell;
import br.com.Utils.TestCont;
import br.com.functions_performed.ElementsPageLogin;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;

/**
 * 
 * @author Gehaime
 *
 */

public class StepLogin {

	private ElementsPageLogin login;
	private TestCont testContextLogin;

	public StepLogin(TestCont context) {
		testContextLogin = context;
		login = testContextLogin.getPageObjectFactory().getLogin();
	}

	@Dado("^que estou no aplicativo advantage shopping$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
		Assert.assertTrue(login.getPageValidation().contains("Advantage"));
	}

	@Dado("^clico_em_fazer_login$")
	public void clico_em_fazer_login() throws Throwable {
		login.getUserLogin();
	}

	@Entao("^login concluído$")
	public void login_concluído() throws Throwable {
		Excell.setExcelFile(Constantes.caminho + Constantes.arquivo, "Planilha1");
		login.getOptions();
		Assert.assertTrue(login.getResp1().contains(Excell.getCellData(0, 1)));

	}

}
