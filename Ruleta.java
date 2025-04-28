
import java.util.Random;

public class Ruleta{

    public static void main(String[] args) {
        new Ruleta();
    }
    
    public Ruleta(){
        Random ra = new Random();
        int [] r = {1,2,3,4};
        int p=0, f = ra.nextInt(30);
        
        for(int i=0;i<f;i++){
            System.out.println(r[p]);
            if(i!=f-1){
                esperar();
                System.out.print("\033[H\033[2J");  
            }
            
            p++;
            if(p==3)
                p=0;
            
        }
    }

    private void esperar(){
        try {
            Thread.sleep(100);  
        } catch (InterruptedException e) {
            
        }
    }
}