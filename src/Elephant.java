
public class Elephant extends BaseAnimal  {
    int position=0;
    int speed = 3;
    double weight = 20;

    public Elephant(int pos, int spd, double wght, Animal aml) {
        super(pos, spd, wght, aml);
    }


    @Override
    public int move() {
        return position += speed;
    }

    @Override
    public Animal reproduce() {
        return new Elephant();
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getPosition() {
        return position;
    }
}
