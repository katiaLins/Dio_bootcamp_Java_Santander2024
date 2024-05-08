import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

       
        Scanner  entrada = new Scanner (System.in);

        System.out.print("Digite o número  1 :");
        int parametroUm = entrada.nextInt();

        
        System.out.print("Digite o número  2 : ");
        int parametroDois = entrada.nextInt();

        try {
            
            contar(parametroUm, parametroDois);

        }

        catch (ParametrosInvalidosException e) {
            
            System.out.println("Info: " + e.getMessage());
        }
    }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
           
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O número 2, precisa ser maior que o número 1");
            }

            for(int n = parametroUm; n <= parametroDois; n++) {
                System.out.println("Imprimindo o número " + n);
            }
           
        }
    }

    class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException (String message) {
            super(message);
        }
    }
