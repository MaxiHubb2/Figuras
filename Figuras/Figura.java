package ar.edu.unlam.pb2.Figuras;

public abstract class Figura {
	protected String nombre;
	protected String color;
	private double lado;

	public Figura(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	public Figura(String nombre, String color) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.color = color;
	}

	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String obtenerColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

//	public Double calcularArea() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract Double calcularArea();
	
	public abstract String getTipo();
	
	public String getColor() {
		
		return this.color;
	}

	@Override
	public String toString() {
		return "Soy Figura [color=" + color + "]";
	}

	

	

	
}
