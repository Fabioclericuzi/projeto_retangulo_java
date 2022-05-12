package entidades;

public class retangulo {

	
	public double largura;
	public double altura;
	
	public double medeArea() {
		return altura * largura;
	}
	public double medePerimetro() {
		return 2 * (altura + largura);
	}
	
	public double medeDiagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}

	

}
