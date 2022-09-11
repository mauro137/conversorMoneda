package main;

import java.util.HashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Conversor {
	HashMap<String, Double> map = new HashMap<>();
	HashMap<String, Double> map2 = new HashMap<>();

	public Conversor() {

	}

	protected void ChooseMoney() {
		map.put("dolares", 1.00);
		map.put("pesos", 0.0037);
		map.put("euros", 1.02);
		map.put("yenes", 0.0070);
		map.put("wones", 0.00072);
		map.put("libras", 1.16);
		// valor segundo input, cuantos dolares hay en 1 n
		map2.put("dolares", 1.00);
		map2.put("pesos", 272.00);
		map2.put("euros", 0.99);
		map2.put("yenes", 142.51);
		map2.put("wones", 1380.06);
		map2.put("libras", 0.86);

		String[] key = map.keySet().toArray(new String[0]);

		// seleccionar moneda, si cancela se cierra el programa
		String money = (String) JOptionPane.showInputDialog(null, "Seleccione su moneda", "Menu",
				JOptionPane.DEFAULT_OPTION, null, key, key[0]);
		double firstMoney = map.get(money);
		if (money == null) {
			main.Util.exitMessage();
			System.exit(0);
		}
		double monto = Util.readNumber();

		// si cancela o devuelve nulo se cierra el programa

		String money2 = (String) JOptionPane.showInputDialog(null, "A que moneda desea convertir?", "Menu",
				JOptionPane.DEFAULT_OPTION, null, key, key[0]);
		if (money2 == null) {
			main.Util.exitMessage();
			System.exit(0);
		}

		double secondMoney = map.get(money2);
		// formula para realizar la conversion + mensaje de devolucion
		// evitar que multiplique por la misma moneda
		if (money == money2) {
			JOptionPane.showMessageDialog(null, "Usted tiene $" + monto + " " + money2, "System Message",
					JOptionPane.WARNING_MESSAGE);
		} else {
			double resultado = (monto * firstMoney) * secondMoney;
			// se setea 2 decimales y redondea parejo

			BigDecimal formatear = new BigDecimal(resultado);

			JOptionPane.showMessageDialog(null,
					"Usted tiene $" + formatear.setScale(2, RoundingMode.HALF_EVEN) + " " + money2, "System Message",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
