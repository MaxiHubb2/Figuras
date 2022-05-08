package ar.edu.unlam.pb2.Figuras;

public class Rectangulo extends Figura {

	private Double lado;
	private Double base;
	
	public Rectangulo(String color, Double lado, Double base) {
		// TODO Auto-generated constructor stub
		super(color);
		this.lado = lado;
		this.base = base;
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		
		return lado*base;
	}

	
	
	public Double getLado() {
		return lado;
	}


	public void setLado(Double lado) {
		this.lado = lado;
	}


	public Double getBase() {
		return base;
	}


	public void setBase(Double base) {
		this.base = base;
	}


	@Override
	public String toString() {
		return "Soy un Rectangulo [lado=" + lado + ", base=" + base + "]"+ " y mi color es: " + getColor();
	}


	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Rectangulo";
	}

	
}