package sorts;
import java.util.ArrayList;
public class JumpSearch {
 /**
  * A search that jumps k values, and checks if target value is in between those k values. If so, search for it. If not,
  * jump k more values and check that range. Repeat.
  *
  * **/

    public int jumpSearch(ArrayList<Integer> array, int jump, int target) {
        int size = array.size();
        int i = 0;
        int k = (int) Math.sqrt(size);
        while (k < size) {
            if (array.get(i) < target && array.get(k) > target) { //found correct range for element
                return search(array, i, k, target);
            }
            else {
                i = k;
                k += k;
            }
        }
        return 1;
    }

    public static int search(ArrayList<Integer> arr, int start, int end, int targ) {
        for (int i = start; i < end; i++) {
            if (arr.get(i) == targ) {
                return targ;
            }

        }
        return -1;
    }

}