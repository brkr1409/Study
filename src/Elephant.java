
public class Elephant extends BaseAnimal  {
    int position=0;
    int speed = 3;
    double weight = 20;
    private Elephant(){}
    public Elephant(int Speed, double Weight) {
        super(Speed, Weight);
    }
    public Animal reproduce() {
        return new Elephant();
    }
}
