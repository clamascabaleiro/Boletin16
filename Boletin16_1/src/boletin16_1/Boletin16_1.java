package boletin16_1;

public class Boletin16_1 {

    public static void main(String[] args) {
        Persoa pers = new Persoa();
        Galo galo1 = new Galo();
        Canario cana1 = new Canario();
        pers.cantar();
        galo1.cantar();
        cana1.cantar();
        System.out.println("****************");
        Ipodecantar obx = new Persoa();
        obx.cantar();
    }
}
