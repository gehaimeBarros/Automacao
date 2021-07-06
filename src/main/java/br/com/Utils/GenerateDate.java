package br.com.Utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author Gehaime
 */
public class GenerateDate {

	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
	}
}
