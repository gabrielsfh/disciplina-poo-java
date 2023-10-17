import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();
        VendaVinho vendaVinho = new VendaVinho();

        System.out.println("Digite o id do cliente:");
        cliente.setIdCliente(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Digite o nome do cliente:");
        cliente.setNome(entrada.nextLine());

        System.out.println("Digite o cpf do cliente:");
        cliente.setCpf(entrada.nextLine());

        System.out.println("Digite o id do vendedor:");
        vendedor.setIdVendedor(entrada.nextInt());

        entrada.nextLine();

        System.out.println("Digite o nome do vendedor:");
        vendedor.setNome(entrada.nextLine());

        System.out.println("Digite o cpf do vendedor:");
        vendedor.setCpf(entrada.nextLine());

        System.out.println("Digite o nome do vinho:");
        String nomeVinho = entrada.nextLine();
        vendaVinho.setNomeVinho(nomeVinho);

        System.out.println("Digite a quantidade de garrafas:");
        int qtdGarrafa = entrada.nextInt();
        vendaVinho.setQtdGarrafa(qtdGarrafa);

        vendaVinho.setVendedor(vendedor);
        vendaVinho.setCliente(cliente);

        cliente.imprimirDados();
        System.out.println();
        vendedor.imprimirDados();
        System.out.println();
        vendaVinho.imprimeDadosVenda();
    }
}
