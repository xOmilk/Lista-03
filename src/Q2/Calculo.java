package Q2;

public class Calculo {

    private double totalSalario;



    void calculaSalario(double salarioBase,double horasTrabalhadas){
        totalSalario=salarioBase*horasTrabalhadas;
    }

    double getTotalSalario(){
        return totalSalario;
    }
}
