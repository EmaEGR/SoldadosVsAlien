package InterfazGrafica;

public class EjecutarJuego 
{
	public static void main(String args[])
	{
		SplashScreen splash = new SplashScreen(2000);
		splash.setLocationRelativeTo(null);
		splash.showSplash();
		
		MenuInicio main = new MenuInicio();
		main.setLocationRelativeTo(null);
	    main.setVisible(true); 
	}
}