package br.com.steps;

import org.junit.Assert;

import br.com.Utils.Constantes;
import br.com.Utils.Excell;
import br.com.Utils.TestCont;
import br.com.functions_performed.ElementsPageRegister;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;

/**
 * 
 * @author Gehaime
 *
 */

public class StepsRegister {

	private ElementsPageRegister cadastrando;
	private TestCont testContext;

	public StepsRegister(TestCont context) {
		testContext = context;
		cadastrando = testContext.getPageObjectFactory().getCadastro();
	}

	@Dado("^que estou no aplicativo advantage shopping mobile$")
	public void que_estou_no_aplicativo_advantage_shopping_mobile() throws Throwable {
		Assert.assertTrue(cadastrando.getPageValidation().contains("Advantage"));
	}

	@Dado("^clico em fazer login$")
	public void clico_em_fazer_login() throws Throwable {
		cadastrando.getPageActions();
	}

	@Dado("^clico em preencher cadastro$")
	public void clico_em_preencher_cadastro() throws Throwable {
		cadastrando.getUserInformation();
	}

	@Entao("^cadastro concluído$")
	public void cadastro_concluído() throws Throwable {
		Excell.setExcelFile(Constantes.caminho + Constantes.arquivo, "Planilha1");
		cadastrando.getRegister();
		cadastrando.getOptions();
		Assert.assertTrue(cadastrando.getResp1().contains(Excell.getCellData(0, 1)));

	}
}