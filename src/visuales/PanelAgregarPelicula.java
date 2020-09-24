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

public class PanelAgregarPelicula extends JPanel {
	private JTextField txtNombre;
	private JLabel lbl_Id;
	private JLabel lblNombre;
	private JLabel lblCategoria;
	private JLabel txtId;
	private JComboBox<Categorias> cboCategoria;
	private JButton btnAceptar;
	private DefaultListModel<Peliculas> listModel;
	

	/**
	 * Create the panel.
	 */
	public PanelAgregarPelicula() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 0, 0, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{30, 0, 0, 0, 0, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lbl_Id = new JLabel("ID");
		lbl_Id.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_Id.setBounds(37, 65, 46, 14);
		add(lbl_Id);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(37, 119, 46, 14);
		add(lblNombre);
		
		lblCategoria = new JLabel("Categor\u00EDa");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCategoria.setBounds(37, 180, 65, 14);
		add(lblCategoria);
		
		txtId = new JLabel("");
		txtId.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtId.setBounds(204, 65, 46, 14);
		add(txtId);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(171, 116, 126, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cboCategoria = new JComboBox<Categorias>();
		cboCategoria.setBounds(171, 177, 126, 20);
		add(cboCategoria);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cboCategoria.getSelectedIndex()==0 ) {JOptionPane.showMessageDialog(null, "Por favor selecionar un género"); }
				else if (txtNombre.getText().isEmpty()==true ) { JOptionPane.showMessageDialog(null, "Por favor Agregar un nombre"); }
				else { 
					
					
					
					JOptionPane.showMessageDialog(null, "Pelicula agregada satisfactoriamente!"); }
			}
		});
		btnAceptar.setBounds(138, 239, 89, 23);
		add(btnAceptar);
		cboCategoria.addItem(new Categorias("Selecione un Genero"));
		cboCategoria.addItem(new Categorias("Terror"));
		cboCategoria.addItem(new Categorias("Accion"));
		cboCategoria.addItem(new Categorias("Suspenso"));
		cboCategoria.addItem(new Categorias("Romantica"));
		cboCategoria.addItem(new Categorias("Thriller"));
	}
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
}
