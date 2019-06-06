import java.util.*;
public class WeeklyPay{
   public static void main (String[] args){
   Model c=new Model();
   Scanner scan= new Scanner(System.in);
   System.out.println("Shtypni oret e rregullta:");
   int ora = scan.nextInt();
   
   System.out.println("Shtypni oret shtese:");
   int ora_shtese = scan.nextInt();
   System.out.println("Shtypni pagen per nje ore te rregullt:");
   double paga_per_ore=scan.nextDouble();
   
   double paga_neto= 0;
   double paga_bruto= 0;
   double paga_per_ore_shtese =0;
   double a = 0;
   paga_bruto = c.pagaBruto(ora,paga_per_ore,ora_shtese);
   paga_neto = c.pagaNeto(paga_bruto,ora); 
   a = paga_bruto-paga_neto;
   System.out.println("Paga Bruto "+paga_bruto+"euro");
   System.out.println("Tvsh dhe zbritjet per pension:"+a);
   System.out.println("Paga Neto:" +paga_neto+ "Euro");
}
}