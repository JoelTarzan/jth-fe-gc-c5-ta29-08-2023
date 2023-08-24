package Ejercicio05;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewEjercicio05 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Botón de limpieza
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(173, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		// Textarea
		textArea = new JTextArea();
		textArea.setBounds(10, 49, 414, 167);
		contentPane.add(textArea);
		
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		textArea.append("Ratón clickeado\n");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		textArea.append("Ratón presionado\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		textArea.append("Ratón liberado\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		textArea.append("El ratón ha entrado en la ventana\n");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		textArea.append("El ratón ha salido de la ventana\n");
	}
}