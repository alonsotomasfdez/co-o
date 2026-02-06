package es.uah.matcomp.estdatos.ejemplo;

public class Persona {

    private String nombre;

    private int edad;

    public Persona(){
        this.setNombre("");
        this.setEdad(-1);
    }

    public Persona(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0) edad=0;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()<1)nombre="Jhon Doe";
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public void aPantalla(){
        System.out.println(this);
    }
}
