public class FuncionarioMensalista extends Funcionario {
    
    private double salarioBase;
    private int horasExtras;
    
    public FuncionarioMensalista(){
        super("","","");
        setSalarioBase(0);
        setHorasExtras(0);
    }
    
    public FuncionarioMensalista(String nome, String cpf, String matricula, double salarioBase, int horasExtras){
        super(nome,cpf,matricula);
        setSalarioBase(salarioBase);
        setHorasExtras(horasExtras);
    }
    
    public FuncionarioMensalista(int horasExtras){
        super("","","");
        setHorasExtras(horasExtras);
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setHorasExtras(int horasExtras){
        this.horasExtras = horasExtras;
    }
    
    public int getHorasExtras(){
        return horasExtras;
    }
    
    public double calculaSalario(){
        return salarioBase + (horasExtras * (salarioBase * 1/160.0));
    }
    
    public void imprimirDados() {
    System.out.printf("--Funcionario Mensalista--%n");
    System.out.printf("Nome: %s%n", super.getNome());
    System.out.printf("CPF: %s%n", super.getCpf());
    System.out.printf("Matricula: %s%n", super.getMatricula());
    System.out.printf("Salario Mensal: %.2f%n", this.getSalarioBase());
    System.out.printf("Horas extras: %d%n", this.getHorasExtras());
    System.out.printf("Salario Calculado: %.2f%n", this.calculaSalario());
}

}