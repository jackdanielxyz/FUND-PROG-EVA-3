public class Main {
    public static void main(String[] args) {

        Persona perso1 = new Persona();

        perso1.nombre = "Dany";
        perso1.apellido = "Perez";
        perso1.edad = 19;
        printPersonas(perso1);
        System.out.println();

        Persona perso2 = new Persona();

        perso2.nombre = "Javier";
        perso2.apellido = "Milei";
        perso2.edad = 49;
        printPersonas(perso2);

    }
    private static void printPersonas(Persona perso){
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
}

class Persona{
    String nombre;
    String apellido;
    int edad;
}

