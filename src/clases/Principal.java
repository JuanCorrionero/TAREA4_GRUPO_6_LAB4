package clases;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import visuales.MenuPrincipal;

public class Principal {
	private static JList listaPeliculas;
	private static DefaultListModel<Peliculas> pModel;


	public static void main(String[] args) {
		pModel = new DefaultListModel<Peliculas>();
		JList listaPeliculas = new JList<Peliculas>();
		listaPeliculas.setModel(pModel);
		MenuPrincipal x = new MenuPrincipal(listaPeliculas, pModel);
		x.cambioVisibilidad(true);
		

	}

}
