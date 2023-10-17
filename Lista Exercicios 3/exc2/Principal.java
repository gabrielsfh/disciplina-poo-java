import java.util.Scanner;

public class Principal
{
   public static void main(String[] args){
    DisciplinaTrimestral trimestral = new DisciplinaTrimestral();
    DisciplinaSemestral semestral = new DisciplinaSemestral();
    DisciplinaAnual anual = new DisciplinaAnual();
    Scanner input = new Scanner(System.in);
    
    System.out.println("-- Disciplina Trimestral --");
    System.out.println("Nome:");
    trimestral.setNome(input.nextLine());
    
    System.out.println("Periodo:");
    trimestral.setPeriodo(input.nextInt());
    
    System.out.println("Nota 1:");
    trimestral.setNota1(input.nextDouble());
    
    System.out.println("Nota 2:");
    trimestral.setNota2(input.nextDouble());
    
    input.nextLine();
    
    System.out.println("-- Disciplina Semestral --");
    System.out.println("Nome:");
    semestral.setNome(input.nextLine());
    
    System.out.println("Periodo:");
    semestral.setPeriodo(input.nextInt());
    
    System.out.println("Nota 1:");
    semestral.setNota1(input.nextDouble());
    
    System.out.println("Nota 2:");
    semestral.setNota2(input.nextDouble());
    
    System.out.println("Nota 3:");
    semestral.setNota3(input.nextDouble());
    
    input.nextLine();
    
    System.out.println("-- Disciplina Anual --");
    System.out.println("Nome:");
    anual.setNome(input.nextLine());
    
    System.out.println("Periodo:");
    anual.setPeriodo(input.nextInt());
    
    System.out.println("Nota 1:");
    anual.setNota1(input.nextDouble());
    
    System.out.println("Nota 2:");
    anual.setNota2(input.nextDouble());
    
    System.out.println("Nota 3:");
    anual.setNota3(input.nextDouble());
    
    System.out.println("Nota 4:");
    anual.setNota4(input.nextDouble());
    
    System.out.println("Nota 5:");
    anual.setNota5(input.nextDouble());
    
    System.out.println("Nota 6:");
    anual.setNota6(input.nextDouble());
    
    input.nextLine();
    
    trimestral.avaliarDisciplina();
    semestral.avaliarDisciplina();
    anual.avaliarDisciplina();
    
    
    
   }
}
