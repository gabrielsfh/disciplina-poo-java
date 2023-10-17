public class CalculoArray
{
    private int[] array;
    
    public CalculoArray(){
        array = new int[5];
    }
    
    public CalculoArray(int[] array){
        setArray(array);
    }

    public int[] getArray(){
        return array;
    }
    
    public void setArray(int[] array){
        this.array = array; 
    }
    
    public void imprimeArray(){
        for (int i = 0; i < array.length; i++){
            System.out.print("|"+ array[i] + "|");
        }
        System.out.println();
    }
    
    public void somaArray() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println("A soma dos valores do array é: " + soma);
    }

    public void mediaArray() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        double media = (double) soma / array.length;
        System.out.println("A média dos valores do array é: " + media);
    }
    
    public void imprimeMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("|"+matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
}
