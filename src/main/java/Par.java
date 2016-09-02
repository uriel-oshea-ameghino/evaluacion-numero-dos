/**
 * Created by damian on 02/09/16.
 */
public class Par {

    public int first;
    public int second;

    public Par(int i, int i1) {
        this.first = i;
        this.second = i1;
        }

    public Par(String casa, int i1) {

        this.first = first();
        this.second = second();

        

    }


    public int first() {
        return this.first;
    }

    public int second() {
        return this.second;
    }

}
