package Miniraknare;

import javafx.scene.control.TextField;

public class Functionality {

	public static void Inputs(TextField input) {
		String[] content = input.getText().split(" "); // Gör en string[] av TextField
		for (int i = 0; i < content.length - 1; i++) {
			
			if (content[i].equals("+")) {
				
				Calculations c = new addition(); //jaok hjälpte med denna raden.
				content[0] = Double.toString(c.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1]))); //Jag kom faktiskt på det här, genialt
				
				
			} else if (content[i].equals("-")) {
				
				Calculations d = new subtraction(); 
				content[0] = Double.toString(d.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("*")) {
				
				Calculations e = new Multiplication(); 
				content[0] = Double.toString(e.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("/")) {
				
				Calculations f = new Division(); 
				content[0] = Double.toString(f.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("\\u221A")) {
				
				Calculations g = new addition(); //Fixa detta.
				content[0] = Double.toString(g.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			} else if (content[i].equals("%")) {
				
				Calculations h = new addition(); //Fixa detta.
				content[0] = Double.toString(h.Calc(Double.parseDouble(content[0]), Double.parseDouble(content[i+1])));

			}
			else {
				
			}
		}
		outputs(content);
		
	}
	public static void outputs(String[] content) {
		Miniraknaren.outputText(content[0]);
	}
}
