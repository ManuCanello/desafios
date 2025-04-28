import java.util.*;

public class CrearContra {
    
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        new CrearContra();
    }
    
    public CrearContra(){
        System.out.println("Longitud de contra:");
        int l = sc.nextInt();
        
        String contra = generarContra(l);

        System.out.println("Contra creada:"+contra);

        adivinarContra(l, contra);
        
       
        
    }


    private  String generarContra(int l){
        
        String contra="";
        char aleatorio;
        
        for(int i=0;i<(l);i++){
            aleatorio = (char) (random.nextInt(127));
            contra = contra + aleatorio;
        }

        return contra;
    }

    private  void adivinarContra(int l,String contra){
        int intentos = 0,ca = 0;
        //ca = character at
        boolean adivinada = false;
        char aleatorio;
        String contraAdivinada ="";
        
        do { 
            
            intentos++;
            aleatorio = (char) (random.nextInt(127));
            
            System.out.println(contraAdivinada+aleatorio);
            
            
            if(aleatorio == contra.charAt(ca)){
                ca++;
                contraAdivinada = contraAdivinada + aleatorio;
            }
                
            
            if(ca == l)
                adivinada=true;
                
            esperar();
            System.out.print("\033[H\033[2J");  
            System.out.flush();

        } while (!adivinada);
        
        System.out.println("Contra adivinada:"+contraAdivinada+"\nIntentos "+intentos);
        

    }

    private void esperar(){
        try {
            Thread.sleep(10);  
        } catch (InterruptedException e) {
            
        }
    }

}
