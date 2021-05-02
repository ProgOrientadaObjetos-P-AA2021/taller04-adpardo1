package pooej2;
/**
 *
 * @author 0zzda
 */
public class ProfesorSueldo {
    private int cedula;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    
    
    public ProfesorSueldo(int ced, String nom, String apell, double suelb){
        cedula = ced;
        nombre = nom;
        apellido = apell;
        sueldoBasico = suelb;        
    }
    
    public void establecerCedula(int ced){
        cedula = ced;
    }
    
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String apell) {
        apellido = apell;
    }

    public void establecerSueldoBasico(double suelb) {
        sueldoBasico = suelb;
    }
    
    public void establecerSueldoTotal(){
        sueldoTotal = (sueldoBasico * 0.2) + sueldoBasico;
    }
    
   public int obtenerCedula(){
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    
    @Override
    public String toString() {
        String e1 = String.format("El profesor de numero de cedula:  %S, %S %S\nTiene un sueldo total de: %s\nSiendo su sueldo basico: %s",
                obtenerCedula(), obtenerNombre(), obtenerApellido(), obtenerSueldoTotal(), obtenerSueldoBasico());
        return e1;
    }
    
}
