public class VendaVinho implements Vinicola {
    private String nomeVinho;
    private int qtdGarrafa;
    private Vendedor vendedor;
    private Cliente cliente;
    
    public VendaVinho() {
        this(new Vendedor(), new Cliente(), "", 0);
    }
    
    public VendaVinho(Vendedor vendedor, Cliente cliente, String nomeVinho, int qtdGarrafa) {
        setNomeVinho(nomeVinho);
        setQtdGarrafa(qtdGarrafa);
        setVendedor(vendedor);
        setCliente(cliente);
    }
    
    public VendaVinho(int qtdGarrafa) {
        setQtdGarrafa(qtdGarrafa);
    }
    
    public void setNomeVinho(String nomeVinho) {
        this.nomeVinho = nomeVinho;
    }
    
    public String getNomeVinho() {
        return nomeVinho;
    }
    
    public void setQtdGarrafa(int qtdGarrafa) {
        this.qtdGarrafa = qtdGarrafa;
    }
    
    public int getQtdGarrafa() {
        return qtdGarrafa;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void addVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
   
    public void addCliente(Cliente cliente) {
        this.cliente = cliente;
    }
   
    public void imprimeDadosVenda() {
        System.out.println("----Dados de venda----");
        System.out.println("Nome Vinho: " + this.getNomeVinho());
        System.out.println("Quantidade de Garrafas: " + this.getQtdGarrafa());
        this.vendedor.imprimirDados();
        this.cliente.imprimirDados();
    }
}