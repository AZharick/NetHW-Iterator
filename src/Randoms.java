import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
   private List<Integer> integerList = new ArrayList<>();

   public Randoms(int min, int max) {
      for (int i = min; i <= max; i++) {
         integerList.add(i);
      }
   }

   @Override
   public Iterator<Integer> iterator() {
      return new Iterator<>() {
         @Override
         public boolean hasNext() {
            return true;
         }

         @Override
         public Integer next() {
            return integerList.get(new Random().nextInt(integerList.size()));
         }
      };
   }

}