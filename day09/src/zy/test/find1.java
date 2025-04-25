package zy.test;

public class find1 {
    /*给你一个大小为 m x n 的二进制矩阵 mat ，请你找出包含最多 1 的行的下标（从 0 开始）以及这一行中 1 的数目。
   如果有多行包含最多的 1 ，只需要选择 行下标最小 的那一行。
   返回一个由行下标和该行中 1 的数量组成的数组。*/
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow = 0;
        int maxCount = 0;
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[0].length; j++){
                count = mat[i][j] == 1 ? count + 1 : count;
            }
            if(count > maxCount){
                maxCount = count;
                maxRow = i;
            }
        }
        return new int[]{maxRow, maxCount};
    }
}
