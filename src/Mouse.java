
public class Mouse implements Animal {
    int position=0;
    int speed = 2;
    double weight = 2;
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
