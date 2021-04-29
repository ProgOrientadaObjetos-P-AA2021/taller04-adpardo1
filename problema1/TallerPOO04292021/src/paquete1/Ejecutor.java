package paquete1;

public class Ejecutor {
    public static void main(String[] args) {
        
        Escuela f1 = new Escuela("Juan Pablo", 7.1, 9.9, 6.1);
        f1.establecerPromedio();
        System.out.printf("%s\n",f1);
    }
}
