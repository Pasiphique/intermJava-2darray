package assignment;

public class Two_dimensional {

    public static void main(String[] args) {
        int[][] teamGoals = new int[2][3]; // 2d array about goals scored per team in a tournament
                                            

        teamGoals[0][0] = 2;
        teamGoals[0][1] = 4;
        teamGoals[0][2] = 0;
     
        teamGoals[1][0] = 2;
        teamGoals[1][1] = 12;
        teamGoals[1][2] = 35;
        System.out.printf("\nTotal goals scored in the tournament: %d goals!",TotalGoals(teamGoals));
    }
    public static int TotalGoals(int[][]teamGoals){ // getting total goals scored
        int total =0;
        int team = 1;
        for (int i = 0; i < teamGoals.length; i++) {
            for (int j = 0; j < teamGoals.length+1; j++) {
                System.out.printf("Team %d has %d goals\n",team,teamGoals[i][j]);
                team++;
                total+=teamGoals[i][j];
            }
            
        }
        return total;
    }

}
