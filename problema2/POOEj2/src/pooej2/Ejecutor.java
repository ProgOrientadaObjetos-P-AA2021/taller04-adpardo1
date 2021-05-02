package pooej2;

/**
 *
 * @author 0zzda
 */
public class Ejecutor {
    public static void main(String[] args) {
        ProfesorSueldo f1 = new ProfesorSueldo(1600686024, "Juan", "Sanchez", 480.50);
        f1.establecerSueldoTotal();
        System.out.printf("%s\n",f1);
    }
    
}
