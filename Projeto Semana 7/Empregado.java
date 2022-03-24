


public class Empregado {

    private String primeiroNome;
    private String sobreNome;
    private float salarioMensal;

public Empregado(String primeiroNome, String sobreNome, float salarioMensal){
    
    this.setPrimeiroNome(primeiroNome);
    this.setSobreNome(sobreNome);
    this.setSalarioMensal(salarioMensal);   
}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0){
        this.salarioMensal = 0;    
        } else {
        this.salarioMensal = salarioMensal;
    }      
}
  
    // Segundo Passo - Anualizar Salario
    
public float calcularAnualizarSalario(){
    return (12 * salarioMensal);
}

// Calculo de Reajuste de Salário com 10%

public float calculoReajuste(){
    salarioMensal = (1.1f * salarioMensal);
    return salarioMensal;
}

}
