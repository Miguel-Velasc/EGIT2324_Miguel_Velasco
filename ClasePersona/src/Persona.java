public class Persona {
   
    private String nombre;
    private String apellidos;
    private int edad;

    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

   
    public void Cumpleaños() {
       
        this.edad++;
        
        System.out.println("¡Feliz Cumpleaños, " + this.nombre + "! Ahora tienes " + this.edad + " años.");
    }

   
}