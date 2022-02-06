package Questao_8;

public class Funcionario
{
    private double salario, liquido;
    private String nome;

    public Funcionario(){

    }

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    //Método que calcula a bonificação e já retorna o salario liquido.
    public double getBonificacao(){
        if(this.salario <= 1000) return liquido = this.salario +(this.salario*0.2);
        else if(this.salario > 1000 && this.salario <= 2000) return liquido =  this.salario + (this.salario*0.1);
        else return liquido = this.salario * 0.9;
    }

//sets
//////////////////////////////////////////////////////////////////////////////////
    public void setSalario(double salario) { this.salario = salario; }
    public void setNome(String nome) { this.nome = nome; }
//gets
//////////////////////////////////////////////////////////////////////////////////
    public double getSalario() { return salario; }
    public String getNome() { return nome; }
}
