public class Desencriptador {
    
    public static String desencirptar(String palabra){
        int array[] = new int[palabra.length()];
        desencriptarCodigoAscii(array,palabra);
        return palabraDesencriptada(array);
        
    }

    private static void desencriptarCodigoAscii(int[] array,String palabra){

        for(int i=0;i<array.length;i++){
            array[i] = (int) palabra.charAt(i)-1;
        }

    }

    private static String palabraDesencriptada(int[] array){
        String palabra = "";

        for(int a : array){
            palabra = palabra + (char) a;
        }
        
        return palabra;
    }
}
