public class Asesor implements Manejador{
	private Manejador proximoManejador;
	public void setNextManejador(Manejador next){
		this.proximoManejador=next;
	}
	public void prestamo(int monto){
		if(monto>=100000 && monto<1000000){
			System.out.println("El prestamo lo manejara el asesor");
		}else{
			proximoManejador.prestamo(monto);
		}
	}
	public Manejador getManejador(){
		return proximoManejador;
	}

}