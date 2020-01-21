import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>() {{
            add(5);
            add(4);
            add(6);
            add(7);
            add(8);
            add(9);
            add(0);
            add(1);
            add(2);
            add(3);
        }};

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            lista.remove(i);
            i--;
        }

        System.out.println();
        System.out.println();
        System.out.println();

        /*List<Integer> lista2 = new ArrayList<Integer>() {{
            add(5);
            add(4);
            add(6);
            add(7);
            add(8);
            add(9);
            add(0);
            add(1);
            add(2);
            add(3);
        }};

        for (Integer number : lista2) {
            System.out.println(number);
            lista2.remove(number);
        }*/

        List<Integer> lista3 = new ArrayList<Integer>() {{
            add(5);
            add(4);
            add(6);
            add(7);
            add(8);
            add(9);
            add(0);
            add(1);
            add(2);
            add(3);
        }};

        Iterator<Integer> iterator = lista3.iterator();

        while (iterator.hasNext()) {
            Integer elementListy = iterator.next();
            System.out.println(elementListy);
            //lista3.remove(elementListy);
            iterator.remove();
        }

        /*List<Record> temp = PhoneBookDataBase
                .getPhoneBookDataBase().getRecordsArray();
        boolean success = false;
        for (Record record : temp) {
            if (record.getIdRecord() == rekordToDelete) {
                temp.remove(record);
                success = true;
                break;
            }
        }*/
    }
}
