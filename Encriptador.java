public class Encriptador{
    
    //Encriptar contra
    public static String encriptar(String palabra){
        int[] array = new int[palabra.length()];
        encriptarCodigoAscii(array, palabra);
        return palabraEncriptada(array);
        
    }
    
    //lo que hace es q cambia al siguiente caracter en el codigo Ascii
    private static void encriptarCodigoAscii(int[] array,String palabra){
        for(int i=0;i<array.length;i++){
            if(array[i]!= 127)
                array[i] = (int) palabra.charAt(i)+1;
            else
                array[i]=1;
        }
    }

    private static String palabraEncriptada(int[] array){
        String encriptada ="";
        
        for(int a : array){
            encriptada = encriptada + (char) a;
        }
        
        return encriptada;
    }

    
    
    
    
}