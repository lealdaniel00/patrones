public class Principal{
	public static void main(String [] args){
		Nissan gtrx1300 = new Nissan(new Varta(true));
		gtrx1300.combustion(100,true);
		Nissan motor2 = new Nissan(new Varta(false));
		motor2.combustion(100,true);

	}
}