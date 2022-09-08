package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

import jdk.jshell.execution.Util;

public class Conversor {
	// valores relativos a 1 peso blue paralelo al 06/09/2022
	final BigDecimal dolares = new BigDecimal(0.00365);
	final BigDecimal euros = new BigDecimal(0.00355);
	final BigDecimal yenes = new BigDecimal(0.52109);
	final BigDecimal wones = new BigDecimal(5.03755);
	final BigDecimal libras = new BigDecimal(0.00318);
	
	String[] moneyConvertOptions = { "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
			"De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Yen a Pesos", "De Won a Pesos",
			"De Libra a Pesos" };

	public Conversor() {

	}
	protected void convertirMoneda() {
		BigDecimal valor = new BigDecimal(0);
		boolean repeat;
		String ToConvert = (String) JOptionPane.showInputDialog(null, "Seleccione Moneda a convertir", "Menu",
				JOptionPane.DEFAULT_OPTION, null, moneyConvertOptions, moneyConvertOptions[0]);
		if (ToConvert == null) {
			main.Util.endMessage();
			System.exit(0);
		}
			do {
			try {
				String value = JOptionPane.showInputDialog("Ingresar monto (solo numeros)");
				valor = BigDecimal.valueOf(Double.valueOf(value));
				repeat = false;

			} catch (NullPointerException exc) {
				main.Util.endMessage();
				System.exit(0);
				repeat = true;
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Solo caracteres numericos, sin espacios en blanco", "Error",
						JOptionPane.WARNING_MESSAGE);
				repeat = true;
			}

		} while (repeat);

		switch (ToConvert) {
		case "De Pesos a Dolar":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.multiply(dolares).setScale(2, RoundingMode.HALF_EVEN) + " dolares");
			break;
		}
		switch (ToConvert) {
		case "De Pesos a Euro":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.multiply(euros).setScale(2, RoundingMode.HALF_EVEN) + " euros");
			break;
		}
		switch (ToConvert) {
		case "De Pesos a Yen":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.multiply(yenes).setScale(2, RoundingMode.HALF_EVEN) + " yenes");
			break;
		}
		switch (ToConvert) {
		case "De Pesos a Won Coreano":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.multiply(wones).setScale(2, RoundingMode.HALF_EVEN) + " wones coreanos");
			break;
		}
		switch (ToConvert) {
		case "De Pesos a Libras":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.multiply(libras).setScale(2, RoundingMode.HALF_EVEN) + " libras");
			break;
		}
		switch (ToConvert) {
		case "De Dolar a Pesos":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.divide(dolares, 2, RoundingMode.HALF_EVEN) + " pesos");
			break;
		}
		switch (ToConvert) {
		case "De Euro a Pesos":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.divide(euros, 2, RoundingMode.HALF_EVEN) + " pesos");
			break;
		}
		switch (ToConvert) {
		case "De Yen a Pesos":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.divide(yenes, 2, RoundingMode.HALF_EVEN) + " pesos");
			break;
		}
		switch (ToConvert) {
		case "De Won a Pesos":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.divide(wones, 2, RoundingMode.HALF_EVEN) + " pesos");
			break;
		}
		switch (ToConvert) {
		case "De Libra a Pesos":
			JOptionPane.showMessageDialog(null,
					"Tienes $ " + valor.divide(libras, 2, RoundingMode.HALF_EVEN) + " pesos");
			break;
		}
	}

}
