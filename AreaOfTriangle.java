import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class AreaOfTriangle {
   public static DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      double r;
      r=((Math.sqrt(3)/4))*(a*a);
      System.out.println(df.format(r));
}
}
