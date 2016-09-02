import Interface.Figura;

import java.util.List;

/**
 * Created by alumno on 02/09/16.
 */
public class Rectangulo implements Figura {


    public int base;
    public int altura;

    public Rectangulo(int i, int i1) {

        this.base=i;
        this.altura = i1;

    }

    public double area(int i, int i1) {
        double areaRectangulo = this.base * this.altura;
        return areaRectangulo;
    }

    public double area() {
        return this.base * this.altura;
    }

    public double perimetro() {
     double perimetroRectangulo = this.base*2 + this.altura*2;
           return perimetroRectangulo;
    }

    public void sumarTodasLasAreas (List <Figura> rectangulos){
        double suma = 0;

        for (Figura r : rectangulos){

            suma = suma + r.area();


        }



    }
}
