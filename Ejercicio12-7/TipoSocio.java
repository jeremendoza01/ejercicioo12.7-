public class TipoSocio {
    class Fecha {
        int dia;
        int mes;
        int anno;

        Fecha(int d, int m, int a) {
            dia = d;
            mes = m;
            anno = a;
        }

        public String fecha() {
            return " " + dia + "-" + mes + "-" + anno;
        }
    };

    int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio(String n, int c, int e, int d, int m, int a) {
        codigo = c;
        nombre = n;
        edad = e;
        f = new Fecha(d, m, a);
    }

    public int getCodigo() {
        return codigo;
    }

    void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
        System.out.println("Fecha: " + f.fecha());
    }

}