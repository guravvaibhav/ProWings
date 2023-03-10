package loops_prob;

public class Prob16 {
    public static void main(String args[]) {

     for (int i=1;i<=5;i++){
        
        System.out.print("\n ");
       for(int j=5;j>=i;j--)
        System.out.print(" ");
        int w=5;
       for(int k=i;k>=2;k--){
           
           for(int x=i;x>=i;x--)
           System.out.print(+w);
           w--;
       }
       
        
       for(int l=1;l<=i;l++)
        System.out.print(+l);
      }
      
        
     
    }
}
