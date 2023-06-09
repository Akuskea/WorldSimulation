public class Rabbit implements Living {
   private int cycles;

   public Rabbit () {
      cycles = 3;
   }
    
   public Living next (Neighborhood n) {
      cycles--;
      int nearbyFox = n.getCount(Fox.class);
      int nearbyGrass = n.getCount(Grass.class);
      int nearbyRabbit = n.getCount(Rabbit.class);

      if ((nearbyFox > 0 && (nearbyFox >= nearbyRabbit)) // eaten
          || nearbyGrass == 0 // starves
          || cycles == 0 // die old
          ) {
         return new Empty();
      } else {
         return this; // still alive
      }
   }

   public char getCharRepresentation () {
      return 'R';
   }
}
