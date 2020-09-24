package visuales;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;

public class panelListarPeliculas extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelListarPeliculas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{47, 55, 30, 105, 0};
		gridBagLayout.rowHeights = new int[]{14, 20, 0, 0, 0, 40, 0, 0, 0, 20, 77, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JList listMovies = new JList();
		GridBagConstraints gbc_listMovies = new GridBagConstraints();
		gbc_listMovies.insets = new Insets(0, 0, 0, 5);
		gbc_listMovies.gridwidth = 3;
		gbc_listMovies.gridheight = 9;
		gbc_listMovies.fill = GridBagConstraints.BOTH;
		gbc_listMovies.gridx = 1;
		gbc_listMovies.gridy = 2;
		add(listMovies, gbc_listMovies);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPeliculas = new GridBagConstraints();
		gbc_lblPeliculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeliculas.gridx = 0;
		gbc_lblPeliculas.gridy = 6;
		add(lblPeliculas, gbc_lblPeliculas);
		
		
	}

}
