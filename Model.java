public class Model{
   public double pagaBruto(int ora,double paga_per_ore,int ora_shtese){
      double paga_bruto= 0;
      double paga_per_ore_shtese =0;
      paga_per_ore_shtese = paga_per_ore + (paga_per_ore/2);
      paga_bruto = (ora * paga_per_ore)+(ora_shtese * paga_per_ore_shtese);
      return paga_bruto;
   }
   public double pagaNeto(double paga_bruto,int ora){
      double paga_neto= 0;
      if(ora > 0 && ora <= 30){
         paga_neto = paga_bruto-(paga_bruto/100)*20;
         }
      else if(ora > 30 && ora <=40){
         paga_neto  = paga_bruto -(paga_bruto/100)*25;
   }
       else{
         paga_neto = paga_bruto - (paga_bruto/100)*28;
   }
   paga_neto-=(paga_neto/100)*5;   
   return paga_neto;
   }
}
