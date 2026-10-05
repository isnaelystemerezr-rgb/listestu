public class Estudiante {
    private String ci;
    private String nombre;
    private String apellido;
    private String sexo;
    private int anio; // año que cursa
    private boolean militante; // true si es de la UJC
    private boolean becado;
    private String mesCumple; // mes de cumpleaños (ej: "Enero")

    public Estudiante(String ci, String nombre, String apellido, String sexo,
                      int anio, boolean militante, boolean becado, String mesCumple) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.anio = anio;
        this.militante = militante;
        this.becado = becado;
        this.mesCumple = mesCumple;
    }

    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public int getAnio() { return anio; }
    public boolean isMilitante() { return militante; }
    public boolean isBecado() { return becado; }
    public String getMesCumple() { return mesCumple; }

    @Override
    public String toString() {
        return "CI: " + ci + " | Nombre: " + nombre + " " + apellido +
                " | Sexo: " + sexo + " | Año: " + anio +
                " | Militante: " + (militante ? "Sí" : "No") +
                " | Becado: " + (becado ? "Sí" : "No") +
                " | Cumple en: " + mesCumple;
    }
}