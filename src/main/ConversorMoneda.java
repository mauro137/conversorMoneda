package main;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	// valores relativos a 1 peso blue paralelo al 06/09/2022
	
	BigDecimal pesos = new BigDecimal(1);
	BigDecimal dolares = new BigDecimal(0.00365);
	BigDecimal euros = new BigDecimal(0.0369);
	BigDecimal yenes = new BigDecimal(0.52109);
	BigDecimal wones = new BigDecimal(5.03755);

	String[] moneyConvertOptions = { "pesos", "dolares", "euros", "yenes", "wones" };

	public ConversorMoneda() {

	}

	protected void convertirMoneda() {
		BigDecimal resultadoConversion = new BigDecimal(0);
		
		String moneyToConvert = (String) JOptionPane.showInputDialog(null, "Seleccione Moneda a convertir", "Menu",
				JOptionPane.DEFAULT_OPTION, null, moneyConvertOptions, moneyConvertOptions[0]);
		String value = JOptionPane.showInputDialog("Ingresar monto");
		double doubleValue = Double.parseDouble(value);

		if (moneyToConvert == "pesos") {
			String moneyToReceive = (String) JOptionPane.showInputDialog(null, "A que moneda desea convertir?", "Menu",
					JOptionPane.DEFAULT_OPTION, null, moneyConvertOptions, moneyConvertOptions[1]);
			// switch

		} else {
			// switch
			JOptionPane.showMessageDialog(null, "else finalizado");

		}
		JOptionPane.showMessageDialog(null, "Tienes $" + resultadoConversion);
		//desea continuar?
	}

}
