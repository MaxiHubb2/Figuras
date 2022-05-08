package ar.edu.unlam.pb2.Figuras;

public class Circulo extends Figura {

	private Double radio;
	private Double diametro;
	
	public Circulo(String nombre) {
			// TODO Auto-generated constructor stub
			super(nombre);
			//this.nombre = nombre;
				}
		
		public Circulo(String nombre, Double diametro) {
			// TODO Auto-generated constructor stub
			super(nombre);
			this.diametro = diametro;
		
		}
		
				
		public Circulo(String nombre, String color) {
			// TODO Auto-generated constructor stub
			super(nombre,color);
		}
		public Circulo(String nombre, String color, Double radio2, Double diametro2) {
			// TODO Auto-generated constructor stub
			super(nombre, color);
			this.radio = radio2;
			this.diametro = diametro2;
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
			return Math.PI*(radio*radio);
		}
		
		public Double calcularPerimetro( ) {
			// TODO Auto-generated method stub
			return Math.PI*diametro;
		}

		@Override
		public String getTipo() {
			// TODO Auto-generated method stub
			return null;
		}		
		
}