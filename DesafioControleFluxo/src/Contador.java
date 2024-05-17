import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

       
        Scanner  entrada = new Scanner (System.in);

        System.out.print("Digite o primeiro número (PARAMETRO) :");
        int parametroUm = entrada.nextInt();

        
        System.out.print("Digite o primeiro número (PARAMETRO) : ");
        int parametroDois = entrada.nextInt();

        
        try {
            
            contar(parametroUm, parametroDois);

        }
   
        catch (ParametrosInvalidosException e) {
            
            System.out.println("Mensagem de error: " + e.getMessage());
        }
    }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
           
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O Segundo número deve ser maior que o primeiro");
            }

            for(int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
           
        }
    }
  
    class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException (String message) {
            super(message);
        }
    }
