import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class RootsOfQuad {
  public static DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
  		Scanner sc=new Scanner(System.in);
      double[] b=new double[3];
      for(int i=0;i<3;i++)
      {
          b[i]=sc.nextDouble();
      }
      double d,r1,r2;
      d=Math.sqrt(((b[1]*b[1])-(4*b[0]*b[2])));
      r1=(-b[1]+d)/(2*b[0]);
      r2=(-b[1]-d)/(2*b[0]);
        System.out.println(df.format(r1));
      System.out.println(df.format(r2));
    }
}
