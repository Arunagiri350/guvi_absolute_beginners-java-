import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int y=sc.nextInt();
      if(y%4==0)
      {
        if(y%100==0)
        {
          if(y%400==0)
          {
            System.out.println("Y");
          }
          else
          {
            System.out.println("N");
          }
        }
        else
          {
            System.out.println("Y");
          }
      }
      else
          {
            System.out.println("N");
          }
    }
}
