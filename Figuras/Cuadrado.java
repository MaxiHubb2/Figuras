package ar.edu.unlam.pb2.Figuras;

public class Cuadrado extends Figura {
private double lado;

//	private String nombre = "";
//	private String color="";
	
	public Cuadrado(String nombre) {
		// TODO Auto-generated constructor stub
		super(nombre);//Primero padre
		//this.nombre = nombre;
	}

	public Cuadrado(String nombre, String color , Double lado) {
		// TODO Auto-generated constructor stub
		super(nombre,color);
		this.lado = lado;
	}

	public Cuadrado(String nombre, String color) {
		// TODO Auto-generated constructor stub
		super(nombre,color);
	}

	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String obtenerColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	public Double calcularArea( ) {
		// TODO Auto-generated method stub
		return Math.pow(this.lado,this.lado);
	}

	public Double calcularPerimetro( ) {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
