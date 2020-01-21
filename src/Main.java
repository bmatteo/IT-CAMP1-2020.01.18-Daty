public class Main {
    public static void main(String[] args) {

        /********************* *******************/

        long before;
        long after;
        long result1;
        long result2;

        before = System.nanoTime();
        for(int i = 0; i < 10000000; i++) {
            Integer zmiennaLokalna = 5;
        }
        after = System.nanoTime();
        result1 = after-before;
        System.out.println(result1);

        /********************* ******************/

        before = System.nanoTime();
        Integer zmiennaGlobalna;
        for(int i = 0; i < 10000000; i++) {
            zmiennaGlobalna = 5;
        }
        after = System.nanoTime();
        result2 = after-before;
        System.out.println(result2);
        System.out.println(((double) result1)/((double) result2));
    }
}
