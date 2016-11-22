
public class Elephant extends BaseAnimal implements Animal {

    int position=0;
    int speed = 3;
    double weight = 20;

    public Elephant(){}

    public Elephant(int Speed, double Weight) {
        super(Speed, Weight);
    }

    public int move(){
        return position+=speed;
    }

    @Override
    public double getWeight(){
        return weight;
    }

    @Override
    public int getPosition(){
        return  position;
    }

    public Animal reproduce() {
        return new Elephant();
    }

}
