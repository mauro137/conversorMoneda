package main;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		String[] converter = { "Conversor de Moneda", "Conversor de Temperatura" };
		String converterList = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Menu",
				JOptionPane.DEFAULT_OPTION, null, converter, converter[0]);
		boolean continuar = false;
		do {
			if (converterList == "Conversor de Moneda") {
				Conversor usuario = new Conversor();
				usuario.convertirMoneda();
				 continuar = Util.endQuestion();
			} else {
				Util.endMessage();
				// instanciar clase
				// ejecutar metodo
			}
		
		} while (continuar); 

	}

}