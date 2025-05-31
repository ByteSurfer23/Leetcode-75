class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int cl = matrix[0].length; 
        int rl = matrix.length;
        for(int i=0; i<rl ; i++)
        {
            if(matrix[i][0]<= target && matrix[i][cl-1]>=target)
            {
                for(int j=0;j<cl;j++)
                {
                    if(target == matrix[i][j])
                    {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
