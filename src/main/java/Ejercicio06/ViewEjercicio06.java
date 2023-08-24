package Ejercicio06;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class ViewEjercicio06 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Altura
		JLabel lblNewLabel = new JLabel("Altura (metros)");
		lblNewLabel.setBounds(10, 36, 104, 14);
		contentPane.add(lblNewLabel);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(124, 33, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		// Peso
		JLabel lblNewLabel_1 = new JLabel("Peso (Kg)");
		lblNewLabel_1.setBounds(265, 36, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setBounds(361, 33, 86, 20);
		contentPane.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		// Calculo
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double imc = Double.parseDouble(textFieldPeso.getText()) / (Double.parseDouble(textFieldAltura.getText()) * Double.parseDouble(textFieldAltura.getText()));
				DecimalFormat formato = new DecimalFormat("#.##");
				textField_2.setText(formato.format(imc) + "");
			}
		});
		btnNewButton.setBounds(124, 90, 128, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(275, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setBounds(321, 91, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

}