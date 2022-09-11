package main;

import javax.swing.JOptionPane;

public class Util extends Conversor {

	protected static double readNumber() {
		double monto = 0;
		boolean repeat;
		do {
			try {
				String value = JOptionPane.showInputDialog("Ingresar cantidad (solo numeros)");
				monto = Double.parseDouble(value);
				repeat = false;

			} catch (NullPointerException exc) {
				main.Util.exitMessage();
				System.exit(0);
				repeat = true;
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Solo caracteres numericos, sin espacios en blanco", "Error",
						JOptionPane.WARNING_MESSAGE);
				repeat = true;
			}

		} while (repeat);

		return monto;
	}

	protected static boolean endQuestion() {
		boolean repeat;
		int continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
		if (continuar == 0) {
			repeat = true;
		} else {
			Util.exitMessage();
			repeat = false;
		}
		return repeat;
	}
	// mensaje cuando se cierra el programa

	protected static void exitMessage() {
		JOptionPane.showMessageDialog(null, "Programa Finalizado", "System Message", JOptionPane.WARNING_MESSAGE);
	}

}
