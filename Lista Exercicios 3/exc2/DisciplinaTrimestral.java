public class DisciplinaTrimestral extends Disciplina
{   
    public DisciplinaTrimestral(){
        super("",0,0,0);
    }
    
    public DisciplinaTrimestral(String nome, int periodo, double nota1, double nota2){
        super(nome,periodo,nota1,nota2);
    }
    
    public DisciplinaTrimestral(String nome){
        super(nome, 0,0,0);
    }
    
    public void avaliarDisciplina(){
       System.out.printf("Disciplina Trimestral: %.2f %n", (super.getNota1() * 0.4) + (super.getNota2() * 0.6));
    }
}
