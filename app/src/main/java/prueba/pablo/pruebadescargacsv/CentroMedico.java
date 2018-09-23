package prueba.pablo.pruebadescargacsv;

public class CentroMedico {
    private String nombre; // AMBUBIERZO;
    private String numRegistro; // 24-C290-0017;
    private String direccion; // CL. MAESTRO URIARTE 3 ;
    private String codPostal; // 24,007; --> 24007
    private String localidad; // LEON;
    private String provincia; // LEON;
    private String telefono; // 987,876,216; --> 987876216
    private String fax; // 987,876,230; --> 987876230
    private String tipoCentro; // OTROS PROVEEDORES DE ASIST. SANITARIA SIN INTERNAMIENTO;
    private String finalidadAsistencial; // TRANSPORTE SANITARIO ;
    private String titularidad; // AMBUBIERZO, S.L.;
    private String dependenciaFuncional; // PRIVADOS

    public CentroMedico() {
    }

    @Override
    public String toString() {
        return "CentroMedico{" +
                "nombre='" + nombre + '\'' +
                ", numRegistro='" + numRegistro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codPostal='" + codPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fax='" + fax + '\'' +
                ", tipoCentro='" + tipoCentro + '\'' +
                ", finalidadAsistencial='" + finalidadAsistencial + '\'' +
                ", titularidad='" + titularidad + '\'' +
                ", dependenciaFuncional='" + dependenciaFuncional + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(String tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public String getFinalidadAsistencial() {
        return finalidadAsistencial;
    }

    public void setFinalidadAsistencial(String finalidadAsistencial) {
        this.finalidadAsistencial = finalidadAsistencial;
    }

    public String getTitularidad() {
        return titularidad;
    }

    public void setTitularidad(String titularidad) {
        this.titularidad = titularidad;
    }

    public String getDependenciaFuncional() {
        return dependenciaFuncional;
    }

    public void setDependenciaFuncional(String dependenciaFuncional) {
        this.dependenciaFuncional = dependenciaFuncional;
    }
}
