package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	JLabel lblSaludo;
	JButton btnSaludar;
	
	public Principal() {
		setResizable(false);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		JLabel lblSaludo = new JLabel("\"Hola Mundo\"");
		lblSaludo.setForeground(Color.WHITE);
		lblSaludo.setFont(new Font("Verdana", Font.ITALIC, 18));
		lblSaludo.setBounds(181, 133, 164, 41);
		getContentPane().add(lblSaludo);

		JButton btnSaludar = new JButton("Ahora me ves");
		btnSaludar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			VisibleInvisible();
			}
		});
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSaludar.setBounds(349, 144, 140, 25);
		getContentPane().add(btnSaludar);
		setTitle("Mi primer ejemplo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 370);
		JPanel pnlSaludo = new JPanel();

	}
	private void VisibleInvisible(){
	boolean teVeo = lblSaludo.isVisible();
	if (!teVeo)
		btnSaludar.setText("Ahora me ves");
	else
		btnSaludar.setText("Ahora no me ves");
		lblSaludo.setVisible(!teVeo);
}
}