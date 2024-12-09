package leetCodeDaily;

public class Question_2554 {
    public static void main(String[] args) {

        int [] banned = {1,6,5};
        int n=5, maxSum = 6;

        Question_2554 que = new Question_2554();

        int result = que.maxCount(banned,n,maxSum);

        System.out.println(result);

    }

    public int maxCount(int[] banned, int n, int maxSum) {

        int output = 0, sum = 0;

        int [ ] arr = new int[n];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }




        return 0;
    }
}
