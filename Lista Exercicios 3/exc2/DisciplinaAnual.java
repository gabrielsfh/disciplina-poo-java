public class DisciplinaAnual extends Disciplina {
    private double nota3;
    private double nota4;
    private double nota5;
    private double nota6;
    
    public DisciplinaAnual() {
        super("", 0, 0, 0);
        setNota3(0);
        setNota4(0);
        setNota5(0);
        setNota6(0);
    }
    
    public DisciplinaAnual(String nome, int periodo, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6){
        super(nome, periodo, nota1, nota2);
        setNota3(nota3);
        setNota4(nota4);
        setNota5(nota5);
        setNota6(nota6);
    }
    
    public DisciplinaAnual(String nome){
        super(nome, 0,0,0);
    }
    
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double getNota3() {
        return nota3;
    }
    
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    
    public double getNota4() {
        return nota4;
    }
    
    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }
    
    public double getNota5() {
        return nota5;
    }
    
    public void setNota6(double nota6) {
        this.nota6 = nota6;
    }
    
    public double getNota6() {
        return nota6;
    }
    
    public void avaliarDisciplina() {
        System.out.printf("Nota disciplina Anual: %.2f %n", ((super.getNota1() + super.getNota2() + this.getNota3() + this.getNota4() + this.getNota5()) / 5.0 * 0.6) + (this.getNota6() * 0.4));

    }
}
