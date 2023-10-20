public class Panasonic extends Radio{
	private int potencia;
	Panasonic(){
		this.potencia=100;
		setMarca("Panasonic");
	}
	public void subirVolumen(){
		System.out.println("Se esta subiendo el volumen de tu radio"+getMarca());
	}
	public void bajarVolumen(){
		System.out.println("Se esta bajando el volumen de tu radio"+getMarca());
	}
}