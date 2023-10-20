public class Sony extends Radio{
	int potencia;
	Sony(){
		this.potencia=100;
		setMarca("Sony");
	}
	public void subirVolumen(){
		System.out.println("El volumen esta subiendo");
	}
	public void bajarVolumen(){
		System.out.println("El volumen esta bajando");
	}
}