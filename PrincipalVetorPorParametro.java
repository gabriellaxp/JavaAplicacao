
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PrincipalVetorPorParametro {

    public static void main(String[] args) {
        Funcionario funcionarios[] = new Funcionario[10];

        adicionar(funcionarios);
//        listar(funcionarios);

//        Funcionario funcionario = buscarPorId(funcionarios, 35);
//        if (funcionario != null) {
//            System.out.println("Funcionário: " + funcionario.getNome());
//        } else {
//            System.out.println("Funcionário não encontrado.");
//        }
//
        double salarioMedio = obterSalarioMedio(funcionarios);
        System.out.println("Salário Médio: " + salarioMedio);
    }

    private static void adicionar(Funcionario funcionarios[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a Data de Contratação: ");
        String dataContratacao = scanner.next();
        System.out.println("Informe a Data de Nascimento: ");
        String dataNascimento = scanner.next();

        Date dc = null;
        Date dn = null;
        try {
            dc = sdf.parse(dataContratacao);
            dn = sdf.parse(dataNascimento);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Funcionario f1 = new Funcionario();
        f1.setId(1);
        f1.setNome("César");
        f1.setSalario(1000);
        f1.setDataContratacao(dc);
        f1.setDataNascimento(dn);

        funcionarios[0] = f1;

        funcionarios[1] = new Funcionario(2, "Ana", 8000,
                new Date(2010, 5, 10), new Date(1990, 10, 28));

        funcionarios[2] = new Funcionario(3, "Maria", 12000,
                new Date(2015, 11, 21), new Date(2000, 11, 18));

        funcionarios[3] = new Funcionario(4, "Carla", 5000,
                new Date(1985, 2, 12), new Date(2010, 10, 23));

        funcionarios[4] = new Funcionario(5, "Melissa", 20000,
                new Date(2018, 8, 12), new Date(1970, 1, 28));
    }

    private static void listar(Funcionario funcionarios[]) {
//        for (int i = 0; i < funcionarios.length; i++) {
//            Funcionario f = funcionarios[i];
//            //....
//            
//        }
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Data de contratação: " + funcionario.getDataContratacao());
            System.out.println("-----------------------------------------");
        }
    }

    private static Funcionario buscarPorId(Funcionario funcionarios[], int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    private static double obterSalarioMedio(Funcionario funcionarios[]) {
        double somaSalario = 0;
        int contar = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                somaSalario += funcionario.getSalario();
                contar++;
            }
        }
        return somaSalario / contar;
    }
    /*
    Implementar um método que retorne o maior salário entre os funcionários
    que estão no vetor.
     */
    
    
    
    /*
    Implementar um método que receba por parâmetro uma porcentagem
    e reajustar o salário de todos os funcionários.
    */

}
