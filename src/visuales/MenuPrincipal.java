package visuales;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Peliculas;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {
	
	


	public MenuPrincipal(DefaultListModel pModel) {
		
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 0, 434, 240);
		getContentPane().add(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				PanelAgregarPelicula panelPelicula = new PanelAgregarPelicula();
				panelPelicula.setDefaultListModel(pModel);
				contentPane.add(panelPelicula);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				panelListarPeliculas panelListar = new panelListarPeliculas();
				
//				TreeSet<Peliculas> listaordenada = new TreeSet<Peliculas>();
//				Collection list = Collections.list(pModel.elements());
//				for(int i=0; i<pModel.getSize(); i++)
//				{
//					listaordenada.add(pModel(i));
//				}
//				
				
				
				panelListar.setDefaultListModel(pModel);
				contentPane.add(panelListar);
				contentPane.repaint();
				contentPane.revalidate();
			}
			
		});
		mnPeliculas.add(mntmListar);
	}

	public void cambioVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
