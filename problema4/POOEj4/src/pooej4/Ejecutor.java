package pooej4;

/**
 *
 * @author 0zzda
 */
public class Ejecutor {

    public static void main(String[] args) {
        Cheques f1 = new Cheques("David Pardo", "Banco de Loja", 1500000);
        f1.establecerComisionBanco();
        System.out.printf("%s\n", f1);
    }
}
