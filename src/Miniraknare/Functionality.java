package Miniraknare;

import javafx.scene.control.TextField;

public class Functionality {

	public void Inputs(TextField input) {
		String[] content = input.getText().split(" "); // G�r en string[] av TextField
		for (int i = 0; i < content.length; i++) {
			
			if (content[i].equals("+")) {
				Calculations c = new addition(); //jaok hj�lpte med denna raden.
				c.Calc(Double.parseDouble(content[i-1]), Double.parseDouble(content[i+1])); //Jag kom faktiskt p� det h�r, genialt

			} else if (content[i].equals("-")) {

			} else if (content[i].equals("*")) {

			} else if (content[i].equals("/")) {

			} else if (content[i].equals("\\u221A")) {

			} else if (content[i].equals("%")) {

			}
			else {
				
			}
		}
	}
}
