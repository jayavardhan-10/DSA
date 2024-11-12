public class Spiral_Pattern2 {
    public static void main(String[] args) {
        
        int n = 10;
        int m;
        int[] arr1 = new int[n];
        int k = 0;
        int odd = 0;
        int count = -7;
        for(int i=0; i<n ; i++)
        {
            arr1[i] = 0;
        }
        if(n%2 == 0)
        {
            m =(n/2) + 1 ;
        }
        else
        {
            m = (int) Math.ceil(n/2);

        }
        for(int i=1; i<=m; i++)
        {
            // once you find the odd row increment odd
            if(i%2 !=0)
            {
                odd++;
                count+=3;
                k = n-(i-2);
                arr1[k-2] = 1;
                if(odd>1)
                {
                    arr1[0] = 1;
                }
                if(count >=0)
                {
                    arr1[count]=1;
                }
                
            }

            for(int j=1; j<=n; j++)
            {

                if(i==1 || j==n)
                {

                    System.out.print("* ");
                }
                // when i is odd 
                else if(arr1[j-1]==1)
                {
                    System.out.print("* ");
                }
                else if(i%2!=0 && j<k && j>)
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