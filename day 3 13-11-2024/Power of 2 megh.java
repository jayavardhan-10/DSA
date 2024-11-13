Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            long x = sc.nextLong();
            int flag = 0;
            int count = 0;
            while(x > 0)
            {
                if((x & 1) == 1) count++;
                x = x >> 1;
                if(count == 2)
                {
                    flag = 1;
                    break;
                } 
            }
            if(flag == 0) System.out.println("True");
            else System.out.println("False");
        }
    }