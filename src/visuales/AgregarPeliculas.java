package visuales;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Categorias;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AgregarPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;

	
	public AgregarPeliculas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPeliculas x = new AgregarPeliculas();
				x.cambioVisibilidad(true);
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarPeliculas x = new ListarPeliculas();
				x.cambioVisibilidad(true);
			}
		});
		mnPeliculas.add(mntmListar);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(72, 55, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(72, 91, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGenero.setBounds(72, 135, 46, 14);
		contentPane.add(lblGenero);
		
		JLabel lblIDGenerado = new JLabel("IDGenerado");
		lblIDGenerado.setBounds(166, 55, 116, 14);
		contentPane.add(lblIDGenerado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(162, 88, 180, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox<Categorias> comboBox = new JComboBox<Categorias>();
		comboBox.setBounds(162, 132, 180, 20);
		contentPane.add(comboBox);
		comboBox.addItem(new Categorias("Selecione un Genero"));
		comboBox.addItem(new Categorias("Terror"));
		comboBox.addItem(new Categorias("Accion"));
		comboBox.addItem(new Categorias("Suspenso"));
		comboBox.addItem(new Categorias("Romantica"));
		comboBox.addItem(new Categorias("Thriller"));
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex()==0 || txtNombre.getText().isEmpty()==true ) { JOptionPane.showMessageDialog(null, "Faltó Agregar un nombre o selecionar un género"); }
				else { JOptionPane.showMessageDialog(null, "Se Agregó exitosamente"); }
			}
		});
		btnAceptar.setBounds(148, 186, 125, 30);
		contentPane.add(btnAceptar);
	}
	
	public void cambioVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
