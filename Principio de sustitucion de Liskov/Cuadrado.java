public class Cuadrado extends Rectangulo {
//this is not good
    public Cuadrado(double x, double y, double ancho, double alto) {
        super(x, y, ancho, alto);
       
    }

    @Override
    public void setAlto(double alto){
        super.setAlto(alto);
        super.setAncho(alto);

    }
    @Override
    public void setAncho(double ancho){
        super.setAncho(ancho);
        super.setAlto(ancho);
    }
    
}
