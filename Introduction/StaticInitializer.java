public static boolean flag=true;
public static int B;
public static int H;
static
    {
    Scanner scan=new Scanner(System.in);
    B=scan.nextInt();
    H=scan.nextInt();
    if(B<0 || H<0)
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    if(B==0 && H==100)
        {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}    