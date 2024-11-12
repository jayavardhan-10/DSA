public class Spiral_Pattern {
    public static void main(String[] args) {
        
        int n = 10;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n ||j==n) 
                {
                    
                    System.out.print("* ");
                }
                else if(j==1 && i>2)
                {
                    System.out.print("* ");
                }
                else if(i==3 && j<n-i+2)
                {
                    System.out.print("* ");
                }
                else
                {
                    
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// if(i%2 == 0 && j==1)
//                     {

//                         System.out.print(" ");
//                         continue;
//                     }