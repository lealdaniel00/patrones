public class Gerente implements Manejador{
	private Manejador proximoManejador;
	public void setNextManejador(Manejador next){
		this.proximoManejador=next;
	}
	public void prestamo(int monto){
		if(monto>=1000000){
			System.out.println("El prestamo lo manejara el gerente");
		}
	}
	public Manejador getManejador(){
		return proximoManejador;
	}

}