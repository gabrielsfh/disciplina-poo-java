public class Vendedor extends Pessoa {
    private int idVendedor;
    
    public Vendedor(){
        super("","");
        setIdVendedor(0);
    }
    
    public Vendedor(String nome, String cpf, int idVendedor){
        super(nome,cpf);
        setIdVendedor(idVendedor);
    }
    
    public Vendedor (String nome){
        super(nome,"");
    }
    
    public void setIdVendedor(int idVendedor){
        this.idVendedor = idVendedor;
    }
    
    public int getIdVendedor(){
        return idVendedor;
    }
    
    public void imprimirDados(){
        System.out.println("--Vendedor--");
        System.out.printf("Nome: %s,Cpf: %s, idVendedor: %d %n", super.getNome(), super.getCpf(), this.getIdVendedor());
    };
}