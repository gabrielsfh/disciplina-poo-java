public class Cliente extends Pessoa {
    private int idCliente;
    
    public Cliente(){
        super("","");
        setIdCliente(0);
    }
    
    public Cliente(String nome, String cpf, int idCliente){
        super(nome,cpf);
        setIdCliente(idCliente);
    }
    
    public Cliente (String nome){
        super(nome,"");
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void imprimirDados(){
        System.out.println("--Cliente--");
        System.out.printf("Nome: %s,Cpf: %s, idCliente: %d %n", super.getNome(), super.getCpf(), this.getIdCliente());
    };
}