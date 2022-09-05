package main;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		int resultado = 25;
		String[] converter = { "Conversor de Moneda", "Conversor de Temperatura" };
		String[] moneyConvertOptions = {"Pesos a Dolar", "Pesos a Euro", "Pesos a Libras", "Pesos a Yen",
				"Pesos a Won Coreano", "Dolar a Pesos", "Euro a Pesos", "Libras a Pesos", "Yen a Pesos",
				"Won Coreano a Pesos" };
		String converterList = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Menu",
				JOptionPane.DEFAULT_OPTION, null, converter, converter[0]);
		if (converterList == "Conversor de Moneda") {
			String moneyInput= (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Menu",
					JOptionPane.DEFAULT_OPTION, null, moneyConvertOptions, moneyConvertOptions[0]);
			String value = JOptionPane.showInputDialog( "Ingresar monto de conversion");
			double doubleValue = Double.parseDouble(value);
			// instanciar clase?
			// ejecuta funcion para convertir la cual retorna el resultado
			JOptionPane.showMessageDialog(null, "Tienes $" + doubleValue + " Dolares");
		} else {
			// lista para elegir que quiere convertir
			// monto temperatura
			// ejecuta funcion la cual retorna el resultado
			// muestra el restulado
		}
	}

}
