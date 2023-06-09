public class Empty implements Living {

    public Living next (Neighborhood n) {
        int nearbyRabbit = n.getCount(Rabbit.class);
        int nearbyGrass = n.getCount(Grass.class);

        if (nearbyRabbit > 2){
                return new Fox();
        }else if(nearbyGrass > 4){
                return new Rabbit();
        }else if(nearbyGrass > 0){
                return new Grass();
        } else {
                return this; // stll empty
        }
    }

    public char getCharRepresentation () {
        return '.'; 
    }


}
   