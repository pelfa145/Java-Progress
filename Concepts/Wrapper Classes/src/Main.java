import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer a  = 123;
        Double b = 123.23;
        Character money = '$';
        Boolean d = true;

        ArrayList<Object> primitivetypes = new ArrayList<>();
        primitivetypes.add(a);
        primitivetypes.add(b);
        primitivetypes.add(d);
        primitivetypes.add(money);

        for(Object object : primitivetypes){
            System.out.println(object);
        }


        Scanner scanner = new Scanner(System.in);


    }
}
