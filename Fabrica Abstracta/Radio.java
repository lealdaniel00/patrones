public abstract class Radio{
	private String marca;
	public abstract void subirVolumen();
	public abstract void bajarVolumen();
	public void setMarca(String marca){
		this.marca=marca;
	}
	public String getMarca(){
		return marca;
	}
}