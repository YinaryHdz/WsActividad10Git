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
}
