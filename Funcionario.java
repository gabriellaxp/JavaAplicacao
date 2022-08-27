
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Funcionario {

    private int id;
    private String nome;
    private double salario;
    private Date dataContratacao;
    private Date dataNascimento;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, double salario, Date dataContratacao, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
