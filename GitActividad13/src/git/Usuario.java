package git;

public class Usuario {
	String id;
	String nombre;
	double []valoraciones;
	public boolean devolverMayorOMenorMediaValoracion(double nota) {
			double media = this.devolverValoracionMedia();
			
			boolean flag = false;
			if (nota>media) {
				flag= true;
			}
			return flag;
		}
		
		public boolean devolverMayorOMenorMediaValoracionTernario(double nota) {
			return (nota>this.devolverValoracionMedia())?true:false;
		}
	
}
