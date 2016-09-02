import Interface.Figura;

/**
 * Created by alumno on 02/09/16.
 */
public class Circulo implements Figura{

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        double areaCirc = Math.PI * this.radio * this.radio;
        return areaCirc;
    }

    public double perimetro() {

        double perimetro = Math.PI * this.radio;
        return perimetro;
    }
}
