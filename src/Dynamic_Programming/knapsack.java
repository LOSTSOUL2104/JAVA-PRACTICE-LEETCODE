package Dynamic_Programming;

public class knapsack {
    private static int[][] DP;
    public static void main(String[] args) {
        int n=3;
        int[] wt={10,20,30};
        int[] val={60,100,120};
        int W=50;
        DP=new int[n+1][W+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<W;j++){
                DP[i][j]=-1;
            }
        }

        System.out.println(knapsack(wt,val,W,n));
    }
    static int knapsack(int[] wt,int[] val,int W, int n){
        if(n==0 || W==0) return 0;

        if(wt[n-1]<=W){
            DP[n][W]=Math.max(val[n-1] + knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1));
        }
        else{
            DP[n][W]=knapsack(wt,val,W,n-1);
        }
        return DP[n][W];
    }
}