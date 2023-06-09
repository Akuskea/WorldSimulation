public class Grass implements Living {

 // check next generation of Grass
    public Living next (Neighborhood n) {
        int nearbyGrass =  n.getCount(Grass.class);
        int nearbyRabbit = n.getCount(Rabbit.class);

        if (nearbyGrass > 2 * nearbyRabbit) {
            return new Rabbit();
        }
        if (nearbyGrass > nearbyRabbit) {
            return this; // still alive
        }
        return new Empty(); // die
    }

    public char getCharRepresentation () {
        return 'G';
    }
}