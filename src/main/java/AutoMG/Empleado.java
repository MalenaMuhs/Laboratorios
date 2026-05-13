package AutoMG;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String codigoEmpleado;
    private double sueldoBasico;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni, String email, String codigoEmpleado, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.codigoEmpleado = codigoEmpleado;
        this.sueldoBasico = sueldoBasico;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double calcularSueldo() {
        return sueldoBasico;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Email: " + email);
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Sueldo: $" + calcularSueldo());
    }
}
