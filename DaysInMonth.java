import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a==2)
      {
        System.out.println("28");
      }
      else if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
      {
        System.out.println(31);
      }
      else if(a==4 || a==6 || a==9 || a==11)
      {
        System.out.println(30);
      }
      else 
      {
        System.out.println("Error");
      }
        
    }
}
