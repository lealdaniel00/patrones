public class Ferrari implements ICarroNuevo{
	private int potenciaMotor;
	Ferrari(){
		potenciaMotor=4200;
	}
	public void arrancarElectrico(){
		System.out.println("El carro ha arrancado electricamente");
	}
	public void direccionHidraulica(){
		System.out.println("El carro tiene dirección hidraulica");
	}
	public void setPotenciaMotor(int pot){
		this.potenciaMotor=pot;
	}
	public int getPotenciaMotor(){
		return potenciaMotor;
	}
}