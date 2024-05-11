import java.util.ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Variables -> espacio en memoria asignado, el cual tiene un tamaño y
        // usualmente tiene un tipo.
        int a = 0;
        String nombre[] = new String[100]; // tamaño fijo ()
        ArrayList<Integer> nombres = new ArrayList();
        System.out.println(nombres.size());
        nombres.add(1);
        nombres.add(2);
        nombres.add(100);
        nombres.add(1000);
        System.out.println(nombres.size());
        System.out.println(nombres.get(1));

        // 0, 1 , 2 ,3 , 4 ,5 , 6 , 7 ,8 , 9
        nombre[0] = "Ferney";
        nombre[1] = "David";
        nombre[2] = "moises";
        nombre[3] = "jorge";
        nombre[4] = "pedro";
        nombre[5] = "daniel";
        nombre[6] = "erika";

    }
}
