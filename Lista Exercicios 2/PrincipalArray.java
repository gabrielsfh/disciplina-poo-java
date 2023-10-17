import java.util.Scanner;

public class PrincipalArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        CalculoArray objArray = new CalculoArray(numeros);

        System.out.print("Valores do Array ->");
        objArray.imprimeArray();

        objArray.somaArray();

        objArray.mediaArray();
        
        
        System.out.println();
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("***Impressao da matriz***");
        objArray.imprimeMatriz(matriz);
    }
}
