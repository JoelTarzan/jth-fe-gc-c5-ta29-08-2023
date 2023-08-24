package Ejercicio03;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEjercicio03 extends JFrame {

	private JPanel contentPane;
	private int counter1 = 0;
	private int counter2 = 0;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 143);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Botón 1
		JLabel lblNewLabel = new JLabel("Botón 1: " + counter1 + " veces");
		lblNewLabel.setBounds(52, 28, 149, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter1++;
				lblNewLabel.setText("Botón 1: " + counter1 + " veces");
			}
		});
		btnNewButton.setBounds(52, 51, 89, 23);
		contentPane.add(btnNewButton);
		
		// Botón 2
		JLabel lblBotn = new JLabel("Botón 2 " + counter2 + " veces");
		lblBotn.setBounds(274, 28, 150, 14);
		contentPane.add(lblBotn);
		
		JButton btnBotn = new JButton("Botón 2");
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter2++;
				lblBotn.setText("Botón 2: " + counter2 + " veces");
			}
		});
		btnBotn.setBounds(274, 51, 89, 23);
		contentPane.add(btnBotn);
	}

}