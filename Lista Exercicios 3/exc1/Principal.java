import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        FuncionarioHorista horista = new FuncionarioHorista();
        FuncionarioMensalista mensalista = new FuncionarioMensalista();
        Scanner input = new Scanner(System.in);
        
        System.out.printf("--Funcionar Horista--%n");
        
        System.out.printf("Digite o nome:%n");
        horista.setNome(input.nextLine());
        
        System.out.printf("Digite o cpf:%n");
        horista.setCpf(input.nextLine());
        
        System.out.printf("Digite a matricula:%n");
        horista.setMatricula(input.nextLine());
        
        System.out.printf("Digite o valor da hora:%n");
        horista.setValorHora(input.nextDouble());
        
        System.out.printf("Digite o numero de horas trabalhadas:%n");
        horista.setHorasTrabalhadas(input.nextInt());
        
        input.nextLine(); //Buffer
        
        System.out.printf("--Funcionar Mensalista--%n");
        
        System.out.printf("Digite o nome:%n");
        mensalista.setNome(input.nextLine());
        
        System.out.printf("Digite o cpf:%n");
        mensalista.setCpf(input.nextLine());
        
        System.out.printf("Digite a matricula:%n");
        mensalista.setMatricula(input.nextLine());
        
        System.out.printf("Digite o salario mensal:%n");
        mensalista.setSalarioBase(input.nextDouble());
        
        System.out.printf("Digite o numero de horas extras:%n");
        mensalista.setHorasExtras(input.nextInt());
        
        input.nextLine(); //Buffer
        
        horista.calculaSalario();
        horista.imprimirDados();
        
        mensalista.calculaSalario();
        mensalista.imprimirDados();
    }
}