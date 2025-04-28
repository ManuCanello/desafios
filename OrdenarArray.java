public class OrdenarArray {

    
    public static void main(String[] args) {
        int[] a= {42, 15, 7, 89, 23, 56, 1, 90, 34, 8, 67, 12};
        new OrdenarArray(a);
    }
    
    
    public OrdenarArray(int[] a){
        System.out.print("Lista desordenada:");
        imprimir(a);
        System.out.print("\nLista ordenada(ascendente):");
        imprimir(ordenarMenorMayor(a));
        System.out.print("\nLista ordenada(descendente):");
        imprimir(ordenarMayorMenor(a));
    }
    
    
    private int[] ordenarMenorMayor(int[] lista){
        int menor,pos;
        
        for(int i=0;i<lista.length;i++){
            menor = lista[i];
            for(int j=0;j<lista.length;j++){
                
                if(menor<lista[j]){
                    menor = lista[j];
                    pos= j;
                    lista[pos] = lista[i];
                    lista[i]=menor;
                }
            }
        }
                
            return lista;
    }

    private int[] ordenarMayorMenor(int[] lista){
        int mayor,pos;
        
        for(int i=0;i<lista.length;i++){
            mayor = lista[i];
            for(int j=0;j<lista.length;j++){
                
                if(mayor>lista[j]){
                    mayor = lista[j];
                    pos= j;
                    lista[pos] = lista[i];
                    lista[i]=mayor;
                }
            }
        }
                
            return lista;
    }

    private void imprimir(int[] lista){
        
        for(int l : lista){
            System.out.print(l+" ");
        }
    }


}
