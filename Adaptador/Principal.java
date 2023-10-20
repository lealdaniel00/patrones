public class Principal{
	public static void main(String [] args){
		DeLorean carroViejo = new DeLorean();
		Adaptador adapter = new Adaptador();
		adapter.setAdaptarCarro(carroViejo);
		adapter.arrancarElectrico();
		adapter.direccionHidraulica();
	}

}