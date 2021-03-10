public class Boton {

    private Accionable accionable;

    public Boton(Accionable accionable) {
        this.accionablePorBoton = accionable;
    }

    public void pulsar() {
        if (condicion) {
            accionable.encender();
        } else {
            accionable.apagar();
        }
    }
}
