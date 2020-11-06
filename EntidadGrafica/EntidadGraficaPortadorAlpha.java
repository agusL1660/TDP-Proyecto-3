package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGraficaPortadorAlpha extends EntidadGrafica{
	
	public EntidadGraficaPortadorAlpha(JLabel label, ImageIcon actual, String[] string, float altura, float ancho) {
		super(label,actual,string,altura,ancho);
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[0]));
	}
}
