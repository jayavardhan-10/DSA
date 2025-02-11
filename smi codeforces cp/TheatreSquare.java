import java.util.Scanner;

public class TheatreSquare
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long m = s.nextInt();
        long a = s.nextInt();
        
        long countn=n/a;
	    long countm=m/a;
        
        if(n%a != 0)
            ++countn;
            
        if(m%a != 0)
            ++countm;
            
        System.out.println(countn*countm);
    }
}