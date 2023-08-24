package Ejercicio02;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEjercicio02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 169);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Etiqueta
		JLabel lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setBounds(24, 39, 333, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNewLabel);
		
		// Botones
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: Botón 1");
			}
		});
		btnNewButton.setBounds(411, 36, 135, 41);
		contentPane.add(btnNewButton);
		
		JButton btnBoton = new JButton("Botón 2");
		btnBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Has pulsado: Botón 2");
			}
		});
		btnBoton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBoton.setBounds(587, 36, 135, 41);
		contentPane.add(btnBoton);
	}

}