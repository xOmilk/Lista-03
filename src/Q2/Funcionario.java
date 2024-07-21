package Q2;

public class Funcionario {

    private String nome,rg,cpf;
    private int matricula;
    private double salario,salarioBase,horasTrabalhadas;
    private String dataContratacao;

    private static int geraMatricula=0;

    public Funcionario(String nome,String dataContratacao,String rg,String cpf, double salarioBase, double horasTrabalhadas){
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setDataContratacao(dataContratacao);
        this.setSalarioBase(salarioBase);
        this.setHorasTrabalhadas(horasTrabalhadas);

        this.matricula= geraMatricula++;
        calculaSalario();



    }

    public void calculaSalario(){
        Calculo calculo= new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        this.salario= calculo.getTotalSalario();

    }

    public void imprimirDados(){
        System.out.println("NOME: "+this.getNome());
        System.out.println("Data de contratação: "+this.getDataContratacao());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RG: "+this.getRg());
        System.out.println("MATRICULA: "+this.getMatricula());
        System.out.println("SALARIO: "+this.getSalario());
        System.out.println("HORAS TRABALHADAS: "+this.getHorasTrabalhadas());
        System.out.println("SALARIO BASE: "+this.getSalarioBase());
    }









    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }


    public double getSalario() {
        return salario;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}
