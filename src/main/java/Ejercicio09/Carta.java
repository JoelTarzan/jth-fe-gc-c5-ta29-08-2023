package Ejercicio09;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;

public class Carta implements ActionListener {

	// Atributos
	private JToggleButton boton;
	private Color color;
	
	// Constructores
	public Carta(JToggleButton boton, Color color) {
		this.boton = boton;
		this.color = color;
	}

	// Métodos
	public JToggleButton getBoton() {
		return boton;
	}

	public void setBoton(JToggleButton boton) {
		this.boton = boton;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (boton.isSelected()) {
			boton.setBackground(null);
			
		} else {
			boton.setBackground(color);
		}
	}
}