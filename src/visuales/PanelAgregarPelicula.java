package visuales;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JTextField;

import clases.Categorias;
import clases.Peliculas;

import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelAgregarPelicula extends JPanel {
	private JTextField txtNombre;
	private JLabel lbl_Id;
	private JLabel lblNombre;
	private JLabel lblCategoria;
	private JComboBox<Categorias> cboCategoria;
	private JButton btnAceptar;
	private DefaultListModel<Peliculas> listModel;
	

	/**
	 * Create the panel.
	 */
	public PanelAgregarPelicula() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{47, 55, 30, 105, 0};
		gridBagLayout.rowHeights = new int[]{14, 20, 0, 0, 0, 40, 0, 0, 20, 77, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lbl_Id = new JLabel("ID");
		lbl_Id.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lbl_Id = new GridBagConstraints();
		gbc_lbl_Id.anchor = GridBagConstraints.NORTH;
		gbc_lbl_Id.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Id.gridx = 1;
		gbc_lbl_Id.gridy = 2;
		add(lbl_Id, gbc_lbl_Id);
		
		JLabel lblId = new JLabel("");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.NORTH;
		gbc_lblId.insets = new Insets(0, 0, 5, 0);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 2;
		add(lblId, gbc_lblId);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 4;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.NORTH;
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 4;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblCategoria = new JLabel("Categor\u00EDa");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
		gbc_lblCategoria.anchor = GridBagConstraints.WEST;
		gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_lblCategoria.gridx = 1;
		gbc_lblCategoria.gridy = 6;
		add(lblCategoria, gbc_lblCategoria);
		
		cboCategoria = new JComboBox<Categorias>();
		GridBagConstraints gbc_cboCategoria = new GridBagConstraints();
		gbc_cboCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboCategoria.insets = new Insets(0, 0, 5, 0);
		gbc_cboCategoria.gridx = 3;
		gbc_cboCategoria.gridy = 6;
		add(cboCategoria, gbc_cboCategoria);
		cboCategoria.addItem(new Categorias("Selecione un Genero"));
		cboCategoria.addItem(new Categorias("Terror"));
		cboCategoria.addItem(new Categorias("Accion"));
		cboCategoria.addItem(new Categorias("Suspenso"));
		cboCategoria.addItem(new Categorias("Romantica"));
		cboCategoria.addItem(new Categorias("Thriller"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cboCategoria.getSelectedIndex()==0 ) {JOptionPane.showMessageDialog(null, "Por favor selecionar un género"); }
				else if (txtNombre.getText().isEmpty()==true ) { JOptionPane.showMessageDialog(null, "Por favor Agregar un nombre"); }
				else { 
					
					
					
					JOptionPane.showMessageDialog(null, "Pelicula agregada satisfactoriamente!"); }
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.anchor = GridBagConstraints.NORTH;
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 8;
		add(btnAceptar, gbc_btnAceptar);
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
}
