public class Elemento {
    TipoSocio socio;
    Elemento sgte;

    public Elemento(TipoSocio e) {
        socio = e;
        sgte = null;
    }

    public TipoSocio getSocio() {
        return socio;
    }

};