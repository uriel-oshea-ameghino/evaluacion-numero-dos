import Interface.Figura;

import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado implements Figura {
    public int lado;

    public Cuadrado(int i) {

        this.lado = i;
    }


    public int sumarAreasDeFiguras(List<Figura> figuras) {

        int suma = 0;
        for (Figura c : figuras) {

            suma = (int) (suma + c.area());


        }
        return suma;
    }


    public double area() {
        return this.lado * this.lado;
    }

    public double perimetro() {
        return this.lado * 4;
    }

    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double suma = 0;
        for (Cuadrado c : cuadrados){

            suma = (suma + c.area());

        }
        return suma;
    }
}
