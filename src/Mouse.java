
public class Mouse extends BaseAnimal {
    int position=0;
    int speed = 2;
    double weight = 2;


    public Mouse(int pos, int spd, double wght, Animal aml) {
        super(pos, spd, wght, aml);

    }

    @Override
    public int move() {
        return position += speed;
    }

    @Override
    public Animal reproduce() {
        return new Mouse();
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
