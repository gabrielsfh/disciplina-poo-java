public class Disciplina {
    
    private String nome;
    private int periodo;
    private double nota1;
    private double nota2;
     
    public Disciplina(){
        this("",0,0,0);
    }
    
    public Disciplina(String nome, int periodo, double nota1, double nota2) {
       setNome(nome);
       setPeriodo(periodo);
       setNota1(nota1);
       setNota2(nota2);
    }
      
    public Disciplina(String nome){
        setNome(nome);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public int getPeriodo() {
        return periodo;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public void avaliarDisciplina(){
        System.out.println("Metodo ainda não implementado");
    };
}
