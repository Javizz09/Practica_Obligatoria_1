package brandubh.util;

/**
 * Autor: Pablo Citores Grupo 103 .
 */
public class Traductor {
	public static Coordenada consultarCoordenadaParaNotacionAlgebraica(String texto) {
	    if (esTextoCorrectoParaCoordenada(texto)) {
	        char letra = texto.charAt(0);
	        char numero = texto.charAt(1);
	        int fila = '8' - numero;
	        int columna = letra - 'a';
	        return new Coordenada(fila, columna);
	    } else {
	        return null;
	    }
	}

    public static boolean esTextoCorrectoParaCoordenada(String texto) {
        if (texto.length() != 2) {
            return false;
        }

        char letra = texto.charAt(0);
        char numero = texto.charAt(1);

        return (letra >= 'a' && letra <= 'g' && numero >= '1' && numero <= '7');
    }

    public static String consultarTextoEnNotacionAlgebraica(Coordenada coordenada) {
        if (coordenada != null) {
            char letra = (char) ('a' + coordenada.columna);
            char numero = (char) ('1' + (7 - coordenada.fila));
            return Character.toString(letra) + Character.toString(numero);
        } else {
            return null;
        }
    }
}
