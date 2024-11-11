public class Solution {
    public int solve(int A, int B, int C, int D) {
        int answer = 0;
        if(A != B)
        {
            if(A==C)
            {
                if(B==D)
                {
                    answer = 0;
                }
            }
            else if(A==D)
            {
                if(B==C)
                {
                    answer = 1;
                }
                else
                {
                    answer = 0;
                }
            }
        }
        else if(A==B)
        {
            if(C==D)
            {
                answer = 1;
            }
            else
            {
                answer = 0;
            }
        }
        
        return answer;
    }
    
}
