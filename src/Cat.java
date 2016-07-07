
public class Cat extends BaseAnimal{
    int position=0;
    int speed = 5;
    double weight = 4;

    public Cat(int pos, int spd, double wght, Animal aml) {
        super(pos, spd, wght, aml);
    }

    public Animal reproduce() {
        return new Cat();
    }


    public boolean consume(Animal a) {
        if(getWeight()<a.getWeight())
            return false;
        else if (getWeight()>a.getWeight())
            weight += (a.getWeight() * 0.2);
            return  true;
    }
}
