import test.Assert;

public class Main {

    public static void main(String[] args) {
        testAnimal(new Cat());
        testAnimal(new Mouse());
        testAnimal(new Elephant());
        testPredator(new Cat());
        System.out.println("Ok!");
    }

    private static void testAnimal(Animal animal) {
        Assert.isTrue(animal.getPosition() == 0, "Start position must be 0");
        Assert.isTrue(animal.getWeight() > 0, "Weight must be greater than 0");
        int move = animal.move();
        Assert.isTrue(move > 0, "Movement result must be greater than 0");
        Assert.isTrue(move == animal.getPosition(), "Movement result and Animal#position must be the same");
        testAnimalReproduce(animal);
    }

    private static void testAnimalReproduce(Animal animal) {
        for (int i = 0; i < 100; i++) {
            Animal child = animal.reproduce();
            Assert.isTrue(child.getClass() == animal.getClass(), "Animal parent and child must be the same class.");
            Assert.isTrue(child != animal, "Animal#reproduce must return a new instance of Animal.");
            animal = child;
        }
    }

    private static void testPredator(Predator predator) {
        testPredatorSuccessConsumption(predator);
        testPredatorFailConsumption(predator);
    }

    private static void testPredatorSuccessConsumption(Predator predator) {
        double originWeight = predator.getWeight();
        boolean result = predator.consume(createVictim(originWeight * 0.1));
        Assert.isTrue(result, "Predator can consume victim with weigh less than predator");
        Assert.isTrue(originWeight < predator.getWeight(), "Predator's weight must be decreased on success consumption");
    }

    private static void testPredatorFailConsumption(Predator predator) {
        double originWeight = predator.getWeight();
        boolean result = predator.consume(createVictim(originWeight * 1.1));
        Assert.isTrue(!result, "Predator can't consume victim with weigh greater than predator");
        Assert.isTrue(originWeight == predator.getWeight(), "Predator's weight must be not changed on fail consumption");
    }

    private static Animal createVictim(final double weight) {
        return new Animal() {
            @Override
            public int move() {
                return 0;
            }

            @Override
            public Animal reproduce() {
                return null;
            }

            @Override
            public double getWeight() {
                return weight;
            }

            @Override
            public int getPosition() {
                return 0;
            }
        };
    }

}
