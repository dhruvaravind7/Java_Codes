public class RobotPositions {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0,1},{0,1,1,0}};
        boolean solution = helper2(matrix);
        System.out.println(solution);
    }

    public static boolean helper2(int[][] matrix) {
        
        for (int i = 0; i < matrix.length - 1; i++) {
            int[] original = matrix[i];
            int[] curr = matrix[i+1];
            int pointer2 = -1;
            for (int j = 0; j < original.length; j++) {
                if (original[j] == 1) {
                    boolean valid = false;
                    if (j != 0 && j-1 > pointer2 && curr[j-1] == 1){
                        pointer2 = j-1;
                        valid = true;
                    } else if (j > pointer2 && curr[j] == 1) {
                        pointer2 = j;
                        valid = true;
                    } else if (j != original.length-1 && j+1 > pointer2 && curr[j+1] == 1) {
                        pointer2 = j+1;
                        valid = true;
                    }
                    if (valid == false) {
                        return (false);
                    }
                }
            }
        }
        return (true);
    }
}

