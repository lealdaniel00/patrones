public abstract class Carro{
	private Radio radioDelCarro;
	Carro(Radio x){
		this.radioDelCarro=x;
	}
	public abstract void acelerar();
}