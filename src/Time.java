public class Time {

    public static void main(String[] args) {

//-----------------------------------------------
        long time1 = System.nanoTime();
        for (int i = 0; i <100000 ; i++) {
            int a = i;
        }
        long time2 = System.nanoTime();

//-----------------------------------------------
        long time3 = System.nanoTime(); //na wszelki wypadek
        int a;
        for (int i = 0; i <100000 ; i++) {
            a=i;
        }
        long time4 = System.nanoTime();


        System.out.println(time2-time1);
        System.out.println(time4-time3);
        System.out.println(((double) (time2-time1)) /((double) (time4-time3)));
    }
}