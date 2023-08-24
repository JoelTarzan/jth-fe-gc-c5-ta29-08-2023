package Ejercicio07;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class ViewEjercicio07 extends JFrame {

	private JPanel contentPane;
	private String modo = "pesetas";
	private JTextField textFieldCantidad;
	private JTextField textFieldResultado;
	private JButton btnConversor;
	private JButton btnCambiarModo;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Cantidad a convertir
		JLabel lblCantidad = new JLabel("Cantidad a convertir");
		lblCantidad.setBounds(10, 40, 123, 14);
		contentPane.add(lblCantidad);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(143, 37, 86, 20);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		// Resultado
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(281, 40, 75, 14);
		contentPane.add(lblResultado);
		
		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setEnabled(false);
		textFieldResultado.setBounds(366, 37, 86, 20);
		contentPane.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		btnConversor = new JButton("Euros a Pesetas");
		btnConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cantidad = Double.parseDouble(textFieldCantidad.getText());
				DecimalFormat formato = new DecimalFormat("#.###");
				
				if (modo == "euros" ) {
					textFieldResultado.setText(formato.format(cantidad / 166.386) + "");
					
				} else {
					textFieldResultado.setText(formato.format(cantidad * 166.386) + "");
				}
			}
		});
		btnConversor.setBounds(107, 85, 134, 23);
		contentPane.add(btnConversor);
		
		btnCambiarModo = new JButton("Cambiar");
		btnCambiarModo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modo == "euros") {
					modo = "pesetas";
					btnConversor.setText("Euros a Pesetas");
					
				} else {
					modo = "euros";
					btnConversor.setText("Pesetas a Euros");
				}
			}
		});
		btnCambiarModo.setBounds(267, 85, 89, 23);
		contentPane.add(btnCambiarModo);
	}

}