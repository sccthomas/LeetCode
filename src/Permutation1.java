import java.util.LinkedList;
import java.util.List;

public class Permutation1 {
    static List<List<Integer>> res = new LinkedList<>();
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        helper(list, new LinkedList<>());
        return res;
    }
    private static void helper(List<Integer> list, List<Integer> curComb) {
        if (list.isEmpty()) {
            List<Integer> temp = new LinkedList<>(curComb);
            res.add(temp);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Integer val = list.remove(i);
            curComb.add(val);
            helper(list, curComb);
            curComb.remove(curComb.size() - 1);
            list.add(i, val);
        }
    }
}
