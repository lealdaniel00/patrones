public class Nissan extends Motor{
	Nissan(Bateria bateria){
		super(bateria); 
	}
	public void combustion(int mezcla, boolean chispa){
		if(chispa==true && bateria.getEsCargada()==true){
			System.out.println("el motor Nissan esta haciendo combustion");
		}else{
			if(chispa==true){
				System.out.println("La bateria del motor NISSAN esta descargada");
			}else{
				System.out.println("No llego la chispa al motor NISSAN");
			}	
		}
	}
}