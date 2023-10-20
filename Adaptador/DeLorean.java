public class DeLorean implements ICarroViejo{
	private int empujar;
	DeLorean(){
		this.empujar=10;
	}
	public void arranqueManivela(){
		System.out.println("El carro ha arrancado por manivela, tomate un vaso de agua");
	}
	public int getEmpujar(){
		return empujar;
	}
	public void setEmpujar(int nuevoValor){
		this.empujar=nuevoValor;
	}
}