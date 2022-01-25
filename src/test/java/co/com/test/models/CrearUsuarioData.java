package co.com.test.models;

public class CrearUsuarioData {

    private String nombres, apellidos, tipoDocumento;
    private long telefono;
    private int numeroDocumento;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public long getTelefono() {
        return telefono;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}