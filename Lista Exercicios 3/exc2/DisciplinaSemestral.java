public class DisciplinaSemestral extends Disciplina{
    private double nota3;
    
    public DisciplinaSemestral(){
        super("",0,0,0);
        setNota3(0);
    }
    
    public DisciplinaSemestral(String nome, int periodo, double nota1, double nota2, double nota3){
        super(nome,periodo,nota1,nota2);
        setNota3(nota3);
    }
    
     public DisciplinaSemestral(String nome){
        super(nome, 0,0,0);
    }
    
    public void setNota3(double nota3){
        this.nota3 = nota3;
    }
    
    public double getNota3(){
        return nota3;
    }
    
    public void avaliarDisciplina(){
        System.out.printf("Nota disciplina Semestral: %2f %n", (super.getNota1() + super.getNota2() + this.getNota3()) / 3.0 );
    }
}