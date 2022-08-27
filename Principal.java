
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Principal {

    private static Funcionario funcionarios[] = new Funcionario[5];

    public static void main(String[] args) {
        adicionar();
        listar();
        Funcionario funcionario = buscarPorId(3);
        if (funcionario != null) {
            System.out.println("Funcionário: " + funcionario.getNome());
        }

        double salarioMedio = obterSalarioMedio();
        System.out.println("Salário Médio: " + salarioMedio);

    }

    private static void adicionar() {
        Funcionario f1 = new Funcionario();
        f1.setId(1);
        f1.setNome("César");
        f1.setSalario(1000);
        f1.setDataContratacao(new Date(2000, 1, 1));
        f1.setDataNascimento(new Date(1980, 1, 8));

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

    private static void listar() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Data de contratação: " + funcionario.getDataContratacao());
            System.out.println("-----------------------------------------");
        }
    }

    private static Funcionario buscarPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    private static double obterSalarioMedio() {
        double somaSalario = 0;
        for (Funcionario funcionario : funcionarios) {
            somaSalario += funcionario.getSalario();
        }
        return somaSalario / 5;
    }

}
