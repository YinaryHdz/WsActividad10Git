package git;

public class Usuario {
	String id;
	String nombre;
	double []valoraciones;
	
	
	//METODOS
	
	//Mostrar las valoraciones 
	public void motrarValoraciones() {
		for(int i = 0;i < this.valoraciones.length ;i++) {
			System.out.println("Lista de valoraciones");
			System.out.println("Valoracion  " + i + " : " +  this.valoraciones[i]);	
		}
	}
}
