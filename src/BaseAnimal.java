// как должен принимать класс BaseAnimal вес и скорость?
// BaseAnimal сравнивает что-то или какая в нем "общая логика"
class BaseAnimal implements Animal{

    public int position;
    public int speed;
    public double weight;
    public Animal animal;

    public BaseAnimal(int pos, int spd, double wght, Animal aml){
        position = pos;
        speed = spd;
        weight = wght;
        animal = aml;
    }

    @Override
    public int move() {
        return position += speed;
    }

    @Override
    public Animal reproduce() {
        //  ???
        return null;
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
