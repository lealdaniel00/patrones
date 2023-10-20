public class FabricaFerrari extends FabricaCarros{
	public Radio fabricarRadio(){
		return new Sony();
	}
	public Carro fabricarCarro(Radio radio){
		return new Ferrari(radio);
	}
}