public class Adaptador implements ICarroNuevo{
	private ICarroViejo carroViejo;
	public void setAdaptarCarro(ICarroViejo dmc1){
		carroViejo = dmc1; 
	}
	public void arrancarElectrico(){
		carroViejo.setEmpujar(4200);
		System.out.println("El carro repotenciado ha sido encendido electricamente con la siguiente fuerza: "+carroViejo.getEmpujar());
	}
	public void direccionHidraulica(){
		System.out.println("El carro tiene dirección hidraulica");
	}
}