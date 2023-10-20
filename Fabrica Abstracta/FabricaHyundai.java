public class FabricaHyundai extends FabricaCarros{
	public Radio fabricarRadio(){
		return new Panasonic();
	}
	public Carro fabricarCarro(Radio radio){
		return new Hyundai(radio);
	}
}