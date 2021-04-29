package paquete1;

public class Escuela {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;
    
    public Escuela(String nombre, double cal1, double cal2, double cal3){
        nombreEstudiante= nombre;
        calificacionMateria1= cal1;
        calificacionMateria2= cal2;
        calificacionMateria3= cal3;
        
    }
    public void establecerNombreEstudiante(String nom){
        nombreEstudiante=nom;
    }
    public void establecerCalificacionEstudiante1(double cal1){
        calificacionMateria1=cal1;
    }
    public void establecerCalificacionEstudiante2(double cal2){
        calificacionMateria2=cal2;
    }
    public void establecerCalificacionEstudiante3(double cal3){
        calificacionMateria3=cal3;
    }
    public void establecerPromedio(){
        promedioCalificaciones= calificacionMateria1 + calificacionMateria2 + calificacionMateria3/3;
    }
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    public double obtenerCalificacionEstudiante1(){
        return calificacionMateria1;
    }
    public double obtenerCalificacionEstudiante2(){
        return calificacionMateria2;
    }
    public double obtenerCalificacionEstudiante3(){
        return calificacionMateria3;
    }
    public double obtenerPromedio(){
        return promedioCalificaciones;
    }
    @Override
    public String toString(){
        String e1 = String.format("El estudiante: %s\n"
                + "Tuvo un promedio total de: %s\n"
                + "Con las calificaciones de %s - %s - %s \n",obtenerNombreEstudiante(), obtenerPromedio(),
                obtenerCalificacionEstudiante1(),obtenerCalificacionEstudiante2(), obtenerCalificacionEstudiante3());
        return e1;
    }
}

