package comunicacion;
//import java.util.*;

public class Alfabeto extends Pictograma {
	//private static ArrayList <String> letras = new ArrayList<String>();
	String letras []=new String[10];
	private String interpretacion;
	
	
	

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public int cantidadLetras() {
		
		return letras.length;	
	}
	
	


	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String toString() {
		return " ; ";
	}


	
	
	
	
}
