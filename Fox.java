
public class Fox implements Living {
   private int cycles;

   Fox() {
      cycles = 5;
   }

 // check next generation of Fox
    public Living next (Neighborhood n) {
        cycles--;
        if ( n.getCount(Fox.class) > 5 || n.getCount(Rabbit.class) == 0|| cycles == 0){
            return new Empty(); // die
        }
        return this; // Fox is still alive!
    }

   public char getCharRepresentation () {
      return 'X';
   }

}