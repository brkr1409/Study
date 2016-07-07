
public class Elephant extends BaseAnimal  {
    int position=0;
    int speed = 3;
    double weight = 20;

    public Elephant(int pos, int spd, double wght, Animal aml) {
        super(pos, spd, wght, aml);
    }
    public Animal reproduce() {
        return new Elephant();
    }
}
