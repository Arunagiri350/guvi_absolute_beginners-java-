import java.util.Scanner;
public class Small {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      //String a=sc.nextLine();
      int[] b=new int[2];
      for(int i=0;i<2;i++)
      {
          b[i]=sc.nextInt();
      }
     // String b[]=a.split("\\S");
      if(b[0]<b[1])
      {
        System.out.println(b[0]);
      }
      else if(b[1]<b[0])
      {
        System.out.println(b[1]);
      }
        
    }
}
