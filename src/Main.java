import contrato.gerador.GeradorContratoAluno;
import pessoa.Aluno;

public class Main 
{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Aluno", "1234678811", "aluno@unochapeco.edu.br", 123455);
        new GeradorContratoAluno(aluno, 5, 100.50);
    }
}