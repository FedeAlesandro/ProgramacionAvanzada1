package paquete;

public class Persona implements Comparable<Persona>{
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre)
    {
        this.edad = edad;
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o) {
        if(this.edad>o.edad)
            return -1;  //si la edad pasada por parametro es menor
        else
            if(this.edad<o.edad) //si la edad pasada por parametro es mayor
                return 1;
            else
                return 0; //si las edades son iguales
    }
}
