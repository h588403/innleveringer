package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
public class Nfakultet {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Tall Større enn null");
		int tall = parseInt(tallTxt);
		int i = 0;
		int totalt = 1;
		
		for(i = 1; i <= tall; i++) {
			totalt = totalt * i;
		}
		System.out.println(totalt);
	}

}
