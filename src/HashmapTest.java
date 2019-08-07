import java.util.HashMap;

public class HashmapTest {

public  static void main(String[] args){
    HashMap<Integer, Boolean> hm = new HashMap<>();
    hm.put(5, true);
    for (Integer k : hm.keySet()){
        k++;
    }
}

}
