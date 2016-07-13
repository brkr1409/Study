
public class Mouse extends BaseAnimal {
    int position=0;
    int speed = 2;
    double weight = 2;
    private Mouse(){}
    public Mouse(int Speed, double Weight) {
        super(Speed, Weight);
    }
    public Animal reproduce() {
     return new Mouse();
    }
}
