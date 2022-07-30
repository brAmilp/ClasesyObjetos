package Constructor;

public class Cuenta {
    //Atributos
    private String DPI;
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructor por defecto
    public Cuenta(){
    }

    //Constructor por parametros
    public Cuenta(String DPI, String nombre, String numeroCuenta, double tipoInteres, double saldo){
        this.DPI = DPI;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(final Cuenta c) {
        DPI = c.DPI;
        nombre = c.nombre;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }
    public void setDPI(String x) {
        DPI = x;
    }
    public void setNombre(String x) {
        nombre = x;
    }
    public void setNumeroCuenta(String x) {
        numeroCuenta = x;
    }
    public void setTipoInteres(double z) {
        tipoInteres = z;
    }
    public void setSaldo(double z) {
        saldo = z;
    }
    public String getDPI() {
        return DPI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }
    public double getSaldo() {
        return saldo;
    }

    public boolean ingreso (double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }

    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    public boolean transferencia(Cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
