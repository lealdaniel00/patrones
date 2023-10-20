public class PagWeb implements Manejador{
	private Manejador proximoManejador;
	public void setNextManejador(Manejador next){
		this.proximoManejador=next;
	}
	public void prestamo(int monto){
		if(monto>0 && monto<100000){
			System.out.println("El prestamo lo manejara la PagWeb");
		}else{
			proximoManejador.prestamo(monto);
		}
	}
	public Manejador getManejador(){
		return proximoManejador;
	}

}