public abstract class Funcionario extends Pessoa {
    private String matricula;
    
    public Funcionario() {
        super("", "");
        setMatricula("");
    }
    
    public Funcionario(String nome, String cpf, String matricula) {
        super(nome, cpf);
        setMatricula(matricula);
    }
    
    public Funcionario(String matricula) {
        super("", "");
        setMatricula(matricula);
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public abstract double calculaSalario();
}
