package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Ventanas.Principal;

public class Aplicacion {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();/*ventana por la que queremos empezar*/
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
