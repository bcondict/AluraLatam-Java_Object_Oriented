// abtract esta porque refiere a que es una representacion abtracta del mismo
// no puede ser instanciado en si
public abstract class Funcionario {

    private String nombre;
    private String Documento;
    private double salario;
    private int tipo;

    public Funcionario() {
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return Documento;
    }
    public void setDocumento(String documento) {
        Documento = documento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    } 

    // ya que es abtracto cada empleado tiene su propia bonificacion
    // public double getBonificacion() {
    //     return this.salario * 0.05;
    // }

    // lo hago abstracto, todas las intancias requieren definir este metodo
    // asi solo lo defino, lo dejo listo para el uso sin darle un valor
    public abstract double getBonificacion();

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
