
public class Elephant implements Animal  {
    int position=0;
    int speed = 3;
    double weight = 20;
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
