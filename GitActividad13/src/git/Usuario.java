package git;

import java.util.Arrays;

public class Usuario {
	String id;
	String nombre;
	double []valoraciones;
	
	// Constructores
		public Usuario() {
			super();
		}
		public Usuario(String id, String nombre, double[] valoraciones) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.valoraciones = valoraciones;
		}
		// Metodos
		
		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
		}
		
		public double devolverValoracionMedia() {
			double media = 0;
			double suma = 0;
			for(int i = 0; i<this.valoraciones.length;i++) {
				suma += this.valoraciones[i];
			}
			media = suma/this.valoraciones.length;
			return media;
			
		}
}
