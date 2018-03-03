import static org.junit.Assert.*;
import org.junit.Test;
import sorts.JumpSearch;



public class TestJumpSearch {

    @Test
    public void generalCase() {

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        assertEquals(4, jumpSearch(nums, 4));

    }

    @Test
    public void edgeCase() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(1);
        }
        nums.add(2)
        assertEquals(2, jumpSearch(nums, 1));

    }

    @Test





}