package Ejercicio04;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ViewEjercicio04 extends JFrame implements WindowListener {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Etiqueta
		JLabel lblNewLabel = new JLabel("Eventos");
		lblNewLabel.setBounds(10, 83, 75, 14);
		contentPane.add(lblNewLabel);
		
		// Textarea
		textArea = new JTextArea();
		textArea.setBounds(125, 11, 476, 158);
		contentPane.add(textArea);
		
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		textArea.append("Ventana abierta\n");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		textArea.append("Ventana cerrándose\n");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		textArea.append("Ventana cerrada\n");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		textArea.append("Ventana minimizada\n");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		textArea.append("Ventana restaurada\n");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		textArea.append("Ventana activada\n");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		textArea.append("Ventana desactivada\n");
	}
}