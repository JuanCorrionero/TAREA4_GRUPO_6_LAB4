package clases;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import visuales.MenuPrincipal;

public class Principal {
	
	private static DefaultListModel<Peliculas> pModel;
	


	public static void main(String[] args) {
		pModel = new DefaultListModel<Peliculas>();
		MenuPrincipal x = new MenuPrincipal(pModel);
		x.cambioVisibilidad(true);
		

	}

}
