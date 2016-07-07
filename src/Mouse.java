
public class Mouse extends BaseAnimal {
    int position=0;
    int speed = 2;
    double weight = 2;
    private Mouse(){}
    public Mouse(int pos, int spd, double wght, Animal aml) {
        super(pos, spd, wght, aml);
    }
    public Animal reproduce() {
        Mouse m = new Mouse();
        return new m;
    }
}
