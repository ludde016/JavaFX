package Miniraknare;

import javafx.scene.control.TextField;

public class Functionality {

	/**
	 * Tar in en TextField fr�n klassen "Miniraknaren" och g�r om den till en string[].
	 * D�refter utf�r den ber�kningar med alla siffror beroende p� vad f�r tecken som finns emellan.
	 * 
	 * @param input
	 */
	public static void Inputs(TextField input) {
		String[] content = input.getText().split(" ");
		for (int i = 0; i < content.length - 1; i++) {
			
			if (content[i].equals("+")) {
				
				Calculations c = new addition(); //jaok hj�lpte med denna raden.
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1]))); //Jag kom faktiskt p� det h�r, genialt
				
				
			} else if (content[i].equals("-")) {
				
				Calculations d = new subtraction(); 
				content[0] = Double.toString(d.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("*")) {
				
				Calculations e = new Multiplication(); 
				content[0] = Double.toString(e.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("/")) {
				
				Calculations f = new Division(); 
				content[0] = Double.toString(f.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("\u221A")) {
				
				Calculations g = new SquareRoot();
				content[0] = Double.toString(g.Sqrt(Double.parseDouble(content[i+1])));

			} else if (content[i].equals("%")) {
				
				Calculations h = new Procent();
				content[0] = Double.toString(h.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			}
		}
		outputs(content);
		
	}
	/**
	 * Skickar svaret fr�n tidigare utf�rda ekvationer till en metod i klassen "Miniraknaren". 
	 * D�r skrivs svaret ut i en TextField. 
	 * 
	 * @param content
	 */
	public static void outputs(String[] content) {
		Miniraknaren.outputText(content[0]);
	}
}
