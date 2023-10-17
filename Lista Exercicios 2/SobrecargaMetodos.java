public class SobrecargaMetodos {
    
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        double[] arrayDouble = {1.5, 2.5, 3.5, 4.5, 5.5};
        String[] arrayString = {"um", "dois", "três", "quatro", "cinco"};
        
        SobrecargaMetodos objSobrecarga = new SobrecargaMetodos();
        objSobrecarga.imprimeValor(arrayInt);
        objSobrecarga.imprimeValor(arrayDouble);
        objSobrecarga.imprimeValor(arrayString);
    }
    
    public void imprimeValor(int[] arrayInt){
        System.out.print("Valores inteiros: ");
        for(int i=0; i<arrayInt.length; i++){
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();
    }
    
    public void imprimeValor(double[] arrayDouble){
        System.out.print("Valores double: ");
        for(int i=0; i<arrayDouble.length; i++){
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println();
    }
    
    public void imprimeValor(String[] arrayString){
        System.out.print("Valores string: ");
        for(int i=0; i<arrayString.length; i++){
            System.out.print(arrayString[i] + " ");
        }
        System.out.println();
    }
}
