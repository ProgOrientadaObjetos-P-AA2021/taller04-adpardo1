package pooej3;

/**
 *
 * @author 0zzda
 */
public class Automotor {

    private int cedulaDueño;
    private String marcaVehiculo;
    private int añoVechiculo;
    private double valorVehiculo;
    private double valorMatricula;

    
    public Automotor(int ced, String marcaV, int añoV, double valorV){
        cedulaDueño = ced;
        marcaVehiculo = marcaV;
        añoVechiculo = añoV;
        valorVehiculo = valorV;       
    }
    
    public void establecerCedulaDueño(int ced){
        cedulaDueño = ced;
    }
    
    public void establecerMarcaVehiculo(String marcaV) {
        marcaVehiculo = marcaV;
    }

    public void establecerAñoVechiculo(int añoV) {
        añoVechiculo = añoV;
    }

    public void establecerValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }
    
    public void establecerValorMatricula(){
        valorMatricula = (valorVehiculo * 0.002)/100;
    }
    
   public int obtenerCedulaDueño(){
        return cedulaDueño;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAñoVechiculo() {
        return añoVechiculo;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }
    
    
    @Override
    public String toString() {
        String e1 = String.format("El portador de la cedula: %s, dueño del vehiculo %s, del año %s,\nDebe pagar por la matricula: %S, ya que el vehiculo tiene un costo de: %s"
                ,obtenerCedulaDueño(), obtenerMarcaVehiculo(), obtenerAñoVechiculo(), obtenerValorMatricula(),obtenerValorVehiculo());
        return e1;
    }
}
