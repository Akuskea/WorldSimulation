public class Field implements Neighborhood {
   Living[] livingArray;
   
   public Field (Living [] livings){
      this.livingArray = livings;
   }

   private int count(String livingName){
      int count =0;
      for(int i=0; i<8; i++){
         if (livingArray[i].getClass().getName() == livingName){
            count++;
         } 
       }
      return count;
   }
   public int getCount (Class<?> c) {
      return count(c.getName());
   }
}
