public class Hyundai extends Carro{
	Hyundai(Radio radio){
		super(radio);
		System.out.println("La radio se configuro exitosamente en el carro Hyundai");
	}
	public void acelerar(){
		System.out.println("Tu carro Hyundai esta acelerando");
	}
}