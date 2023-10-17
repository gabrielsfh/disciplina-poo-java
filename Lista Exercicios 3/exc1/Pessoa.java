public abstract class Pessoa
{
    private String nome;
    private String cpf;
    
    public Pessoa(){
        this("","");
    }
    
    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public abstract void imprimirDados();
}
