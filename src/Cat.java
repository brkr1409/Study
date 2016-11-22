
public class Cat extends BaseAnimal implements Predator, Animal {

    int position=0;
    int speed = 5;
    double weight = 4;

    public Cat(){
    }

    public int move(){
        return position+=speed;
    }

    public Cat(int Speed, double Weight) {
        super(Speed, Weight);
    }

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

    public boolean consume(Animal a) {
        if(getWeight()<a.getWeight())
            return false;
        else if (getWeight()>a.getWeight())
            weight += (a.getWeight() * 0.2);
            return  true;
    }
}
