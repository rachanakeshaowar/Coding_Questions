import java.util.ArrayList;
import java.util.List;
public class Permutation_list_in_list_leetcode_46 {
    public void helper(int[] nums, List<Integer> ds, boolean[] isValid, List<List<Integer>> ans) {
        int n = nums.length;
        if (ds.size() == n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < ds.size(); i++) {
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isValid[i] == false) {//call lagega
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums, ds, isValid, ans);
                isValid[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];//false
        helper(nums, ds, isValid, ans);
        return ans;
    }
    public static void main(String[] args) {
        Permutation_list_in_list_leetcode_46 permutation = new Permutation_list_in_list_leetcode_46();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutation.permute(nums);
        for (List<Integer> perm : result) {
            System.out.println(perm);
    }
}
}



