
package secuenciales;

import java.util.Scanner;


public class secuenciales20 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
   
    int h,m,s, sE,sF,tS,mF,hF, C1=3600,C2=60;
        System.out.println("escriba horas, minutos y segundos");
        h=teclado.nextInt();
        m=teclado.nextInt();
        s=teclado.nextInt();
        
        tS=(h*C1)+(m*C2)+s;
        hF=(tS/C1);
        sE=tS-(hF*C1);
        mF=(sE/C2);
        sF=sE-(mF*C2);
        
        System.out.println("resultado: "+hF+"h "+mF+"m "+sF+"s");
        
        
        
        
        

    }
  
}
