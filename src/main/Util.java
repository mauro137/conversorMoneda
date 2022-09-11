package main;
import javax.swing.JOptionPane;

public class Util {
	protected static boolean endQuestion() {		
		boolean repeat;
		int continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
		if (continuar == 0) {
			repeat = true;
		} else {
			Util.endMessage();
			repeat = false;
		}
		return repeat;
	}
	//mensaje cuando se cierra el programa
	protected static void endMessage() {
		 JOptionPane.showMessageDialog(null, "Programa Finalizado", "System Message",
				JOptionPane.WARNING_MESSAGE);
	}
}
