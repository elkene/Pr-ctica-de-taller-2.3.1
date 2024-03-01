import java.util.Scanner;

public class Persona {
    // Atributos demográficos
    private String nombre;
    private int edad;
    protected String comida;
    private String altura;
    protected String profesion;

    // Constructores
    public Persona(String nombre, int edad, String comida, String altura, String profesion, int horas) {
        this.nombre = nombre;
        this.edad = edad;
        this.comida = comida;
        this.altura= altura;
        this.profesion = profesion;
    }

    // Métodos set y get para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getaltura() {
        return altura;
    }

    public void setGenero(String altura) {
        this.altura = altura;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    // Método comer
    protected void comer(String nombre, String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    // Método dormir
    private void dormir(int horas) {
        System.out.println(nombre + " está durmiendo por " + horas + " horas");
    }

    // Método tomarShower
    public void tomarShower(String shower2) {
        String shower = "caliente";

        if (shower.equals(shower)){
            System.out.println(nombre + " está tomando una ducha caliente");
        }
        else {
            System.out.println(nombre + " está tomando una ducha fría");
        }
    }

    public void info(String nombre, int edad, String comida, String altura, String ciudad, String shower, int horas){

        System.out.println(nombre + " tiene " + edad + " años" + ", mide " + altura + " mts " + ",esta comiendo " + comida + ". Vive en " + ciudad + ", le gusta bañarse con agua " + shower + " y duerme " + horas + " horas." );


    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        
        System.out.println("¿Cuántos años tienes?  ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("¿Cuánto mides [en mts]?  ");
        String altura = scanner.nextLine();
        
        System.out.println("¿Qué estas comiendo?  ");
        String comida = scanner.nextLine();

        System.out.println("¿Cuántas horas duermes?  ");
        int horas = scanner.nextInt();
        scanner.nextLine();      

        System.out.println("¿En qué ciudad vives? ");
        String ciudad = scanner.nextLine();
        
        System.out.println("¿Te bañas con agua caliente o fria? ");
        String shower = scanner.nextLine();

        Persona persona = new Persona(nombre, edad, altura, comida, ciudad, horas);        
        // Ejemplo de uso de los métodos
        System.out.println("\n-------------------------------------------------");
        persona.comer(nombre,comida);
        persona.dormir(horas);
        persona.tomarShower(shower);
        System.out.println("\n-------------------------------------------------");
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        persona.info( nombre,  edad,  comida,  altura,  ciudad, shower, horas);

        scanner.close();

    }
}
