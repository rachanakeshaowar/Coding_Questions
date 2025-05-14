import java.util.ArrayList;
import java.util.List;

public class Method2_Permutation_46 {
    public void helpher(int[] nums, int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(nums[i]);

            }
            ans.add(l);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(i, idx, nums);
            helpher(nums, idx + 1, ans);
            swap(i, idx, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();//mandatory
        helpher(nums, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        Method2_Permutation_46 permutation = new Method2_Permutation_46();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutation.permute(nums);
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
// time complexity n!
// space complexity 1

