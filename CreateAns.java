package baseball;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
public class CreateAns {
    Random random = new Random();
    LinkedHashSet<Integer> setAns = new LinkedHashSet<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public int[] createAns(int count){
        setAns.clear();
        arrayList.clear();
        while(setAns.size() < count){
            setAns.add(random.nextInt(9)+1);
        }
        int[] arr = new int[setAns.size()];
        arrayList.addAll(setAns);
        for(int i=0; i<arrayList.size(); i++){
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
