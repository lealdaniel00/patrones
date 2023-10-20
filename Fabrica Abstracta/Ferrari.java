public class Ferrari extends Carro{
	Ferrari(Radio radio){
		super(radio);
		System.out.println("La radio se configuro exitosamente en el carro Ferrari");
	}
	public void acelerar(){
		System.out.println("Tu carro Ferrari esta acelerando");
	}
}