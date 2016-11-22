
public class Mouse extends BaseAnimal implements Animal {

    int position=0;
    int speed = 2;
    double weight = 2;

    public Mouse(){}

    public Mouse(int Speed, double Weight) {
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
     return new Mouse();
    }
}
