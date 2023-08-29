package Ejercicio09;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import javax.swing.Timer;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;

public class ViewEjercicio09 extends JFrame {

	private JPanel contentPane;
	private JToggleButton primeraCarta;
	private JToggleButton segundaCarta;
	private int intentos = 0;
	private int aciertos = 0;

	/**
	 * Create the frame.
	 */
	public ViewEjercicio09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		// Lista de colores
		ArrayList<Color> colores = new ArrayList<Color>();
		colores.add(Color.BLACK);
		colores.add(Color.BLACK);
		colores.add(Color.RED);
		colores.add(Color.RED);
		colores.add(Color.BLUE);
		colores.add(Color.BLUE);
		colores.add(Color.GREEN);
		colores.add(Color.GREEN);
		colores.add(Color.YELLOW);
		colores.add(Color.YELLOW);
		colores.add(Color.ORANGE);
		colores.add(Color.ORANGE);
		colores.add(Color.PINK);
		colores.add(Color.PINK);
		colores.add(Color.WHITE);
		colores.add(Color.WHITE);
		
		// Mezclamos los colores
		Collections.shuffle(colores);
		
		// Lista de cartas
		ArrayList<JToggleButton> cartas = new ArrayList<JToggleButton>();
		
		// Creamos las cartas automáticamente
		for (int i = 0; i < 16; i++) {
			
			final int index = i;
			
			JToggleButton carta = new JToggleButton("");
			carta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// Si no se ha seleccionado aún ninguna carta
					if (primeraCarta == null) {
                        primeraCarta = carta;
                        primeraCarta.setBackground(colores.get(index));
                        
                        // Si hay una primera carta seleccionada y no una segunda
                    } else if (segundaCarta == null && primeraCarta != carta) {
                        segundaCarta = carta;
                        segundaCarta.setBackground(colores.get(index));

                        // Si los colores de las dos cartas seleccionadas son iguales
                        if (primeraCarta.getBackground().equals(segundaCarta.getBackground())) {
                        	contentPane.remove(primeraCarta);
                        	contentPane.remove(segundaCarta);
                        	contentPane.revalidate();
                        	contentPane.repaint();
                        	
                            primeraCarta = null;
                            segundaCarta = null;
                            
                            intentos++;
                            aciertos++;
                            
                            if(aciertos == 8) {
                            	JOptionPane.showMessageDialog(null, "¡Enhorabuena! Has ganado con " + intentos + " intentos.");
                            	dispose();
                            }
                                     
                            // Si las cartas son diferentes, le añadimos un nuevo listener que se lanzara pasado un tiempo
                        } else {
                            ActionListener resetAction = new ActionListener() {
                                public void actionPerformed(ActionEvent event) {
                                    primeraCarta.setSelected(true);
                                    segundaCarta.setSelected(true);
                                    primeraCarta.setBackground(null);
                                    segundaCarta.setBackground(null);
                                    primeraCarta = null;
                                    segundaCarta = null;
                                }
                            };
                            
                            Timer timer = new Timer(1000, resetAction);
                            timer.setRepeats(false);
                            timer.start();
                            
                            intentos++;
                        }
                    }
					
				}
			});
			carta.setSelected(true);
			cartas.add(carta);
			
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.fill = GridBagConstraints.BOTH;
			gbc_button.insets = new Insets(0, 0, 5, 5);
			gbc_button.gridx = i % 4;
            gbc_button.gridy = i / 4;
            contentPane.add(carta, gbc_button);
		}
	}
}