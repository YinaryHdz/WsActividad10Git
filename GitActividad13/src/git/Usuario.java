package git;

public class Usuario {
	String id;
	String nombre;
	double []valoraciones;


public int devolverPuntuacionesMasAltas(double nota) {
	int notas_mayores = 0;
	for (double d : valoraciones) {
		if (d>nota) {
			notas_mayores++;
		}

	}
	return notas_mayores;
}
	
	
	//METODOS
	
	//Mostrar las valoraciones 
	public void motrarValoraciones() {
		for(int i = 0;i < this.valoraciones.length ;i++) {
			System.out.println("Lista de valoraciones");
			System.out.println("Valoracion  " + i + " : " +  this.valoraciones[i]);	
		}

	}
}
