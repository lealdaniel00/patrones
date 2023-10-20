import java.util.Scanner;
public class Cliente{
	public static void main(String [] args){
		Carro carroDeMisSuenos;
		Orquestador concesionario = new Orquestador();
		Scanner leer = new Scanner(System.in);
		System.out.println("El cliente va a comprar un carro, ingrese 1 para Ferrari, 2 para Hyundai");
		int opcion = leer.nextInt();
		if(opcion==1){
			carroDeMisSuenos=concesionario.comprarCarro(new FabricaFerrari());
		}else{
			carroDeMisSuenos=concesionario.comprarCarro(new FabricaHyundai());

		}
		carroDeMisSuenos.acelerar();
	}
}