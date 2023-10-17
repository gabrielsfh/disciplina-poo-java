public class FuncionarioHorista extends Funcionario {
    
    private double valorHora;
    private int horasTrabalhadas;
    
    public FuncionarioHorista(){
        super("","","");
        setValorHora(0);
        setHorasTrabalhadas(0);
    }
    
    public FuncionarioHorista(String nome, String cpf, String matricula, double valorHora, int horasTrabalhadas){
        super(nome,cpf,matricula);
        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }
    
    public FuncionarioHorista(int horasTrabalhadas){
        super("","","");
        setHorasTrabalhadas(horasTrabalhadas);
    }
    
    
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    
    public double getValorHora(){
        return valorHora;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public double calculaSalario(){
       return valorHora * horasTrabalhadas; 
    }
    
    public void imprimirDados() {
    System.out.printf("--Funcionario Horista--%n");
    System.out.printf("Nome: %s%n", super.getNome());
    System.out.printf("CPF: %s%n", super.getCpf());
    System.out.printf("Matricula: %s%n", super.getMatricula());
    System.out.printf("Valor hora: %.2f%n", this.getValorHora());
    System.out.printf("Horas Trabalhadas: %d%n", this.getHorasTrabalhadas());
    System.out.printf("Salario Calculado: %.2f%n", this.calculaSalario());
}
}