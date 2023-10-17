import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[2];
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Cadastro da pessoa " + (i+1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            
            pessoas[i] = new Pessoa(nome, idade, cpf);
            System.out.println();
        }
        
        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Tamanho do nome da pessoa " + (i+1) + ": " + pessoas[i].getNome().length());
        }
        
        
        if (pessoas[0].getNome().equals(pessoas[1].getNome())) {
            System.out.println("Os nomes cadastrados são iguais");
        } else {
            System.out.println("Os nomes cadastrados são diferentes");
        }
        
        
        String nomesConcatenados = pessoas[0].getNome().concat(pessoas[1].getNome());
        System.out.println("Nomes concatenados: " + nomesConcatenados);
        
        
        for (int i = 0; i < pessoas.length; i++) {
            int indice = pessoas[i].getCpf().indexOf("100");
            if (indice >= 0) {
                System.out.println("A substring \"100\" foi encontrada no CPF da pessoa " + (i+1) + " no índice " + indice);
            } else {
                System.out.println("A substring \"100\" não foi encontrada no CPF da pessoa " + (i+1));
            }
        }
        
       
        System.out.println();
        System.out.println("Informações das pessoas:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }
    }
}