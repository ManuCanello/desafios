public class D1{

    

    public static void main(String[] args) {
        new D1();
    }

    public D1(){
        desafio1();
    }


    private  void desafio1(){
        int[] array = {10,5,6,3,12,1,7,8,9,4,11,2,0,13};
        System.err.println("Number missing:"+calculateMissinig(sumateArray(array.length), sumateMissingArray(array)));
    }


    private int sumateMissingArray(int[] array){
        int res=0;
        for(int c: array){
            res+=c;
        }

        return res;
    }

    private int sumateArray(int length){
        int res=0;
        for(int i=0;i<length+1;i++){
            res += i;
        }

        return res;
    }

    private int calculateMissinig(int total, int totalArray){
        return total - totalArray;
    }
}