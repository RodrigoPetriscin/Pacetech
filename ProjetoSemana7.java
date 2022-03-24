
public class ProjetoSemana7 {

   
    public static void main(String[] args) {
       
        Empregado colaboradorHum = new Empregado("Antonio", "Ermírio de Moraes", 3000.00f);
        System.out.println("Colaborador " + colaboradorHum.getPrimeiroNome() + " " + colaboradorHum.getSobreNome());
        System.out.println("Valor Mensal do Salário é de R$ 3000.0 ");
        System.out.println("Valor do Salário Anualizado é de R$ " + colaboradorHum.calcularAnualizarSalario());
        System.out.println("Será Concedido um Reajuste por Mérito de 10% ao Colaborador ");
        colaboradorHum.calculoReajuste();
        System.out.println("Novo Valor do Salário Reajustado é de R$ " + colaboradorHum.getSalarioMensal());
        System.out.println("Novo Valor do Salário Anualizado é de R$ " + colaboradorHum.calcularAnualizarSalario());
        
        System.out.println();
        
        Empregado colaboradorDois = new Empregado("Abílio", "Diniz", 5000.0f);
        System.out.println("Colaborador " + colaboradorDois.getPrimeiroNome() + " " + colaboradorDois.getSobreNome());
        System.out.println("Valor Mensal do Salário é de R$ 5000.0 ");
        System.out.println("Valor do Salário Anualizado é de R$ " + colaboradorDois.calcularAnualizarSalario());
        System.out.println("Será Concedido um Reajuste por Mérito de 10% ao Colaborador ");
        colaboradorDois.calculoReajuste();
        System.out.println("Novo Valor do Salário Reajustado é de R$ " + colaboradorDois.getSalarioMensal());
        System.out.println("Novo Valor do Salário Anualizado é de R$ " + colaboradorDois.calcularAnualizarSalario());
        
        System.out.println();
        System.out.println("Obrigado por utilizar nosso App.");
    }
    
}
