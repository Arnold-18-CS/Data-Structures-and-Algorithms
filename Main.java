import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        Node test = new Node(1);
        System.out.println(test.data);

        test.deleteByData(1);
        System.out.println(test.data);
    }
}
