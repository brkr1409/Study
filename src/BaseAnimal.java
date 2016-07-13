// как должен принимать класс BaseAnimal вес и скорость?
// BaseAnimal сравнивает что-то или какая в нем "общая логика"
abstract class BaseAnimal implements Animal{

    private int position;
    private int speed;
    private double weight;
    private Animal animal;
    public BaseAnimal(){
        position = 0;
        speed = 0;
        weight = 0;
    }
    public BaseAnimal(int spd, double wght){
        speed = spd;
        weight = wght;
    }

    @Override
    public int move() {
        return position += speed;
    }

    //@Override
    //abstract public Animal reproduce();

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getPosition() {
        return position;
    }


    public boolean consume(Animal a) {
        if(this.weight < a.getWeight())
            return false;
        else
            weight += (a.getWeight() * 0.2);
            return  true;
    }
}
