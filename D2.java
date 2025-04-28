import java.util.ArrayList;

public class D2 {
    

    public static void main(String[] args) {
        new D2();
    }


    public D2(){
        desafio2();
    }

    private void desafio2(){
        ArrayList<String[][]> list = new ArrayList<>();
        String chain = "xx[],jnuuunnxxx";
        int count = 1;
        String currentChar = chain.substring(0,1);

        for(int i=0;i<chain.length();i++){
            
            if(i<chain.length()-1){
                if(chain.charAt(i) == chain.charAt(i+1))
                    count++;
                else{
                    String chain_array[][] = {{currentChar,String.valueOf(count)}};
                    list.add(chain_array);
                    count = 1;
                    currentChar = String.valueOf(chain.charAt(i+1));
                }
            }else{
                if(chain.charAt(i) == chain.charAt(i-1)){
                    String chain_array[][] = {{currentChar,String.valueOf(count)}};
                    list.add(chain_array);
                }else{
                    String chain_array[][] = {{currentChar,String.valueOf(count)}};
                    list.add(chain_array);
                }
            }
        }

        printArray(list);
        translateArray(list);

    }

    private void printArray(ArrayList<String[][]> list) {
        for(String[][] l : list){
            System.out.println(l[0][0]+"="+l[0][1]);
        }
    }

    private void translateArray(ArrayList<String[][]> list){
        for(String[][] l : list){
            System.out.print(writeLetters(l[0][0], l[0][1]));
        }
    }

    private String writeLetters(String character, String counts){
        String res = "";
        for(int i=0;i<Integer.parseInt(counts);i++){
            res += character;
        }

        return res;
    }
}
