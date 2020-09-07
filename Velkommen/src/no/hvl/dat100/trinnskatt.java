package no.hvl.dat100;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class trinnskatt {

	public static void main(String[] args) {
		// skrive inn tall
		String inntektTxt = showInputDialog("Inntekt");
		int inntekt = parseInt(inntektTxt);
		
		double a = (230950 - 164101) * 0.0093;
		double b = (580650 - 230951) * 0.0241;
		double c = (934050 - 580651) * 0.1152;
		double d = (inntekt - 934050) * 0.1452;

		
	
		
		if (inntekt >= 0 && inntekt <= 164100) {
			showMessageDialog(null,"Din trinnskatt er: " + inntekt * 0.0 );
		}
		if (inntekt >= 164101 && inntekt <= 230950) {
			showMessageDialog(null,"Din trinnskatt er: " + (inntekt - 164100) * 0.0093 );
		}
		if (inntekt >= 230951 && inntekt <= 580650) {
			showMessageDialog(null,"Din trinnskatt er: " + (a + (inntekt - 230950) * 0.0241 ));
		}
		if (inntekt >= 580651 && inntekt <= 934050) {
			showMessageDialog(null,"Din trinnskatt er: " + (a + b +(inntekt - 580650) * 0.1152 ));
		}
		if (inntekt >= 934051 && inntekt > 934051) {
			showMessageDialog(null,"Din trinnskatt er: " + (a + b + c + d));
		}
		
		

	
	}
}
