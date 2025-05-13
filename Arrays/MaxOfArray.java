class Max {
    void max() {
        int arr[] = {1, 2, 3, 4};
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];

            }
        }
        System.out.println(ans);

    }
}

    public class MaxOfArray {

        public static void main(String[] args) {
            Max obj = new Max();
            obj.max();

        }
    }


