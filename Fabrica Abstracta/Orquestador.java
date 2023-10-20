public class Orquestador{
	public Carro comprarCarro(FabricaCarros pedido){
		return pedido.fabricarCarro(pedido.fabricarRadio());
	}
}