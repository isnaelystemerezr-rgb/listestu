public class ListaEstudiantes {
    private Nodo primero;

    public ListaEstudiantes() {
        this.primero = null;
    }

    // Método para agregar estudiantes a la lista
    public void agregar(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    // a) Listar nombres de estudiantes que cumplen años en un mes dado
    public void cumpleaños(String mes) {
        System.out.println("--- Estudiantes que cumplen años en " + mes + " ---");
        Nodo actual = primero;
        boolean hay = false;
        while (actual != null) {
            if (actual.getDato().getMesCumple().equalsIgnoreCase(mes)) {
                System.out.println(actual.getDato().getNombre() + " " + actual.getDato().getApellido());
                hay = true;
            }
            actual = actual.getSiguiente();
        }
        if (!hay) {
            System.out.println("No hay estudiantes que cumplan en ese mes.");
        }
    }

    // b) Listar militantes ordenados por año de menor a mayor
    public void cantMilitantes() {
        System.out.println("--- Militantes de la UJC (ordenados por año) ---");

        // Primero contamos cuántos militantes hay
        int cont = 0;
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato().isMilitante()) {
                cont++;
            }
            actual = actual.getSiguiente();
        }

        if (cont == 0) {
            System.out.println("No hay militantes registrados.");
            return;
        }

        // Creamos un arreglo con los militantes
        Estudiante[] militantes = new Estudiante[cont];
        actual = primero;
        int i = 0;
        while (actual != null) {
            if (actual.getDato().isMilitante()) {
                militantes[i] = actual.getDato();
                i++;
            }
            actual = actual.getSiguiente();
        }

        // Ordenamos por año (método burbuja sencillo)
        for (int j = 0; j < cont - 1; j++) {
            for (int k = 0; k < cont - 1 - j; k++) {
                if (militantes[k].getAnio() > militantes[k + 1].getAnio()) {
                    Estudiante temp = militantes[k];
                    militantes[k] = militantes[k + 1];
                    militantes[k + 1] = temp;
                }
            }
        }

        // Mostramos la información
        for (int j = 0; j < cont; j++) {
            System.out.println(militantes[j]);
        }
    }

    // c) Cantidad de estudiantes becados
    public int cantBecados() {
        int cont = 0;
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getDato().isBecado()) {
                cont++;
            }
            actual = actual.getSiguiente();
        }
        return cont;
    }
}