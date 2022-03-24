import java.util.Scanner;

public class ProjetoSemana6 {

    
    public static void main(String[] args) {
        float dollarCot;
        float celsiusTemp = 0;
        float fahrenheitTemp = 0;
        float reaisValue = 0;
        float dollarValue = 0;
        char option;
        char resume = 'y';
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Welcome to Easy Trip for EUA");
        System.out.println();
        System.out.print("Enter the US Dollar Exchange Rate: ");
        
        dollarCot = leitor.nextFloat();
        
        while (resume == 'Y' || resume == 'y'){
            
            System.out.println("\nLook at the available options below");
            System.out.println();
            System.out.println(" 1 - Converter - ºCelsius - ºFahrenheit\n");
            System.out.println();
            System.out.println(" 2 - Converter - ºFahrenheit - ºCelsius\n");
            System.out.println();
            System.out.println(" 3 - Converter - R$ Real for US$ Dollar\n");
            System.out.println();
            System.out.println(" 4 - Converter - R$ Real for US$ Dollar");
            System.out.println();
            System.out.println();
            System.out.print  ("=======> Enter your conversion option below: ");
            
            option = leitor.next().charAt(0);
            
            switch(option){
                
                case '1':
                    System.out.print("Enter Temperature Celsius Degrees: ");
                    celsiusTemp = leitor.nextInt();
                    fahrenheitTemp = 1.8f * celsiusTemp + 32;
                    System.out.println("\n==> Temperature: " + celsiusTemp + "ºC Converted " + fahrenheitTemp + "ºF.");
                    break;
                    
                    case '2':
                    System.out.print("Enter Temperature Fahrenheit Degrees: ");
                    fahrenheitTemp = leitor.nextInt();
                    celsiusTemp = (fahrenheitTemp - 32) / 1.8f;
                    System.out.println("\n==> Temperature: " + fahrenheitTemp + "ºF Converted " + celsiusTemp + "ºC.");
                    break;
                    
                    case '3':
                    System.out.print("Enter the value in (R$): ");
                    reaisValue = leitor.nextFloat();
                    dollarValue = reaisValue / dollarCot;
                    System.out.println("\n==> Total: R$ " + reaisValue + " Converted US$ " + dollarValue + " Today.");
                    break;
                    
                    case '4':
                    System.out.print("Enter the value in (US$): ");
                    dollarValue = leitor.nextFloat();
                    reaisValue = dollarValue* dollarCot;
                    System.out.println("\n==> Total: US$ " + dollarValue + " Converted R$ " + reaisValue + " Today.");
                    break;
                    
                    default:
                    System.out.println("\n==> Option is not found! ");
                    
            } // fim switch
            
            System.out.print("\nBack to menu? (Y - Yes / N - No): ");
            resume = leitor.next().charAt(0);
            
            }  // fim while
        
          System.out.println("\nThanks for using our app\n");
            
            
        }
        
    }
    
