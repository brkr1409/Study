/**
 * Created by w0wfa on 05.07.2016.
 */
public class Cat implements Animal{
    int position=0;
    int speed = 2;
    double weight = 4;
    @Override
    public int move() {
        return position+=speed;
    }

    @Override
    public Animal reproduce() {
        return new Cat();
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
