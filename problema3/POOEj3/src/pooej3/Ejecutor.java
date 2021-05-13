package pooej3;

/**
 *
 * @author 0zzda
 */
public class Ejecutor {
    public static void main(String[] args) {
        Automotor f1 = new Automotor(1600686024, "Chevrolet", 2018, 15000.5);
        f1.establecerValorMatricula();
        System.out.printf("%s\n",f1);
    }
    
}
