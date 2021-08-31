import java.util.Scanner;
import myPackage.ValidaCpf;

public class MainPart {
    /**
     * @author joao
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String CPF;

        System.out.println("Informe um CPF: ");
        CPF = ler.next();

        System.out.println("\nResultado: ");
        //Usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if(ValidaCpf.isCPF(CPF))
            System.out.println("\n" + ValidaCpf.imprimeCPF(CPF));
        else System.out.println("Erro, CPF invalido!!\n");
    }
}
