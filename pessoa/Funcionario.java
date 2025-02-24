package pessoa;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, String idade, String matricula, String cargo, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + ", cargo=" + cargo
                + ", salario=" + salario + "]";
    }

    

}
