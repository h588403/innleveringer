package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class fredagmodul4 {

	public static void main(String[] args) {
		String karTxt = showInputDialog("Tallkarakter");
		int tallkarakter = parseInt(karTxt);
		String karakter;
		int karaktertall= 0;
		
		if (tallkarakter >= 90 && tallkarakter <= 100) {
			karaktertall= 6;
		}
		if (tallkarakter >= 80 && tallkarakter <= 89) {
			karaktertall= 5;
		}
		if (tallkarakter >= 60 && tallkarakter <= 79) {
			karaktertall= 4;
		}
		if (tallkarakter >= 50 && tallkarakter <= 59) {
			karaktertall= 3;
		}
		if (tallkarakter >= 40 && tallkarakter <= 49) {
			karaktertall= 2;
		}
		if (tallkarakter >= 0 && tallkarakter <= 39) {
			karaktertall= 1;
		}
		
		
		
		switch (karaktertall) {
		case 6: karakter = "A - Fremragende"; break;
		case 5: karakter = "B. Meget god"; break;
		case 4: karakter = "C- God"; break;
		case 3: karakter = "D- Nokså god"; break;
		case 2: karakter = "E- Tilstrekkelig"; break;
		case 1: karakter = "F- Ikke bestått"; break;
		default: karakter = "ugyldig karakter";
		}
		showMessageDialog(null, karakter);

	}

}
