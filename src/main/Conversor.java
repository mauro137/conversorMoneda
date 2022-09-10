package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Conversor {
	HashMap<String, Double> map = new HashMap<>();
	HashMap<String, Double> map2 = new HashMap<>();

	public Conversor() {

	}

	protected void ChooseMoney() {
		double monto = 0;
		boolean repeat;
		// valor primer input, cuanto n hay en 1 dolar
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
		System.out.println(Arrays.toString(key));

		String money = (String) JOptionPane.showInputDialog(null, "Seleccione su moneda", "Menu",
				JOptionPane.DEFAULT_OPTION, null, key, key[0]);
		if (money == null) {
			main.Util.endMessage();
			System.exit(0);
		}
		double firstMoney = map.get(money);
		do {
			try {
				String value = JOptionPane.showInputDialog("Ingresar monto (solo numeros)");
				monto = Double.parseDouble(value);
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

		String money2 = (String) JOptionPane.showInputDialog(null, "A que moneda desea convertir?", "Menu",
				JOptionPane.DEFAULT_OPTION, null, key, key[0]);
		if (money2 == null) {
			main.Util.endMessage();
			System.exit(0);
		}
		double secondMoney = map.get(money2);
		double resultado = (monto * firstMoney) * secondMoney;
		JOptionPane.showMessageDialog(null, "Usted tiene $" + resultado, "System Message", JOptionPane.WARNING_MESSAGE);
		// hay que redondear el resultado con big decimal
		// hay que conseguir get clave del segundo input para imprimir

	}

}
