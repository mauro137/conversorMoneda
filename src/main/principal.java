package main;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String[] converter = { "Conversor de Moneda", "Conversor de Temperatura" };
		
		String converterList = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Menu",
				JOptionPane.DEFAULT_OPTION, null, converter, converter[0]);
		if (converterList == "Conversor de Moneda") {
			ConversorMoneda usuario = new ConversorMoneda();
			usuario.convertirMoneda();
		} else {
			// instanciar clase
			// ejecutar metodo
		}
	}

}
