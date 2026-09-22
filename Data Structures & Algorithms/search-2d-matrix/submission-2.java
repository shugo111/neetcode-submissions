class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowi=0,lowj=0; int highi=matrix.length-1; int highj=matrix[0].length;

        while(lowi<=highi){
             int midi= lowi+(highi-lowi)/2;
             if(matrix[midi][0]>target){
                highi=midi-1;
             }else if(matrix[midi][matrix[0].length -1]<target){
                lowi=midi+1;
             }else{
                int lo=0,hi= matrix[0].length -1;
                while(lo<=hi){
                    int mid= lo+(hi-lo)/2;
                    if(matrix[midi][mid]==target){
                        return true;
                    }else if (matrix[midi][mid]<target){
                        lo =mid+1;
                    }else{
                        hi=mid-1;
                    }
                }
                return false;
             }
        }
        return false;
    }
}
