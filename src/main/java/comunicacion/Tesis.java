package comunicacion;
import java.util.*;

public class Tesis extends Escrito{
	private String idea;
	private static ArrayList <String> argumentos = new ArrayList<String>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*5;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
		r += this.idea+ "\n";
		r += Tesis.argumentos.size()+ "\n";
		r += this.conclusion+ "\n";
		r += this.referencias+ "\n";
		r += this.interpretacion+ "\n";
		return  r;
	}
	
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public static ArrayList<String> getArgumentos() {
		return argumentos;
	}
	public static void setArgumentos(ArrayList<String> argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
