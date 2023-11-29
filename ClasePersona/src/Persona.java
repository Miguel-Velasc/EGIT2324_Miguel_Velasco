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
        
        System.out.println("¡Feliz Cumpleaños, " + this.nombre +" " + this.apellidos + "! Ahora tienes " + this.edad + " años.");
    }
    public void DatosPersona() {
      System.out.println("Eres: " + this.nombre +" " + this.apellidos + " y tienes " + this.edad + " años.");

    }

   
}