import java.util.Scanner;
public class Mark {
    /*有6位评委给选手打分，分数范围是【0~100】之间的整数，
    * 选手最后得分为：去掉最高分、最低分后的4个评委的平均分。
    * 计算选手的得分*/
    public static void main(String[] args) {
        int[] scoresArr = getScores();
        int max = getMax(scoresArr);
        int min = getMin(scoresArr);
        int sum = getSum(scoresArr);
        int avg = (sum - max - min) / (scoresArr.length - 2);
        System.out.println(avg);
    }

    public static int[] getScores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Scores:");
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; ) {
            int score = sc.nextInt();//控制分数
            if(score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("Invalid Score.");
            }
        }
        return scores;
    }

    public static int getMax(int[] scoresArr){
        int max = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if(scoresArr[i] > max){
                max = scoresArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoresArr){
        int min = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if(scoresArr[i] < min){
                min = scoresArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoresArr){
        int sum = 0;
        for (int i = 0; i < scoresArr.length; i++) {
            sum += scoresArr[i];
        }
        return sum;
    }
}
