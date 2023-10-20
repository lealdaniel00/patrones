public class Banco implements Manejador{
	private Manejador proximoManejador;
	public void setNextManejador(Manejador next){
		this.proximoManejador=next;
	}
	public void prestamo(int monto){
		PagWeb pag = new PagWeb();
		Asesor ase = new Asesor();
		Gerente ger = new Gerente();
		this.proximoManejador=pag;
		pag.setNextManejador(ase);
		ase.setNextManejador(ger);
		proximoManejador.prestamo(monto);

	}
	public Manejador getManejador(){
		return proximoManejador;
	}
	
}