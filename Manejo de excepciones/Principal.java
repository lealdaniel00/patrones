public class Principal{
	private int costo;
	private String nombre;	
	Principal(String nombreCarro, int costoCarro) throws Exception{
		this.nombre=nombreCarro;
		if(costoCarro<1000){
			throw new Exception("El carro que usted esta comprando esta muy barato, no sea tacaño");
		}
	}
	
	public static void main(String args[]) throws Exception{
		Principal carro = new Principal("Carro chino",50);
		System.out.println("WASasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("HOLA QUE MAS");
	}

}