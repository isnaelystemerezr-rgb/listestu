public class Main {
    public static void main(String[] args) {
        ListaEstudiantes lista = new ListaEstudiantes();

        // Agregamos estudiantes de prueba
        lista.agregar(new Estudiante("010101", "Ana", "Pérez", "F", 2, true, true, "Marzo"));
        lista.agregar(new Estudiante("020202", "Luis", "Gómez", "M", 1, false, false, "Marzo"));
        lista.agregar(new Estudiante("030303", "Carlos", "Ruiz", "M", 3, true, true, "Julio"));
        lista.agregar(new Estudiante("040404", "Marta", "López", "F", 1, true, false, "Diciembre"));
        lista.agregar(new Estudiante("050505", "Pedro", "Sosa", "M", 2, false, true, "Mayo"));

        // a) Probar cumpleaños
        System.out.println("===== PRUEBA A =====");
        lista.cumpleaños("Marzo");
        System.out.println();

        // b) Probar militantes
        System.out.println("===== PRUEBA B =====");
        lista.cantMilitantes();
        System.out.println();

        // c) Probar becados
        System.out.println("===== PRUEBA C =====");
        int becados = lista.cantBecados();
        System.out.println("Cantidad de estudiantes becados: " + becados);
    }
}