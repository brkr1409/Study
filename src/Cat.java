
public class Cat implements Animal, Predator{
    int position=0;
    int speed = 5;
    double weight = 4;
    @Override
    public int move() {
        return position += speed;
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

    @Override
    public boolean consume(Animal a) {
        if(getWeight()<a.getWeight())
            return false;
        else if (getWeight()>a.getWeight())
            weight += (a.getWeight() * 0.2);
            return  true;
    }
}
