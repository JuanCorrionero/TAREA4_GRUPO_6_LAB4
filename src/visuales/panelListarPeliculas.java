package visuales;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import clases.Peliculas;

import javax.swing.JList;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;

public class panelListarPeliculas extends JPanel {
	
	private DefaultListModel<Peliculas> listModel;
	private JList<Peliculas> lista;
	
	/**
	 * Create the panel.
	 */
	public panelListarPeliculas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{47, 55, 0, 30, 105, 0};
		gridBagLayout.rowHeights = new int[]{14, 20, 0, 0, 0, 40, 0, 0, 0, 0, 20, 0, 77, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblPeliculas = new GridBagConstraints();
		gbc_lblPeliculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblPeliculas.gridx = 0;
		gbc_lblPeliculas.gridy = 7;
		add(lblPeliculas, gbc_lblPeliculas);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.gridheight = 8;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);
		
		lista = new JList<Peliculas>();
		scrollPane.setViewportView(lista);
		
		
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
		lista.setModel(this.listModel);
	}

}
