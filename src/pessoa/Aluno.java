package pessoa;

/**
 * Classe responsável por manipular os dados de um aluno da academia
 */
public class Aluno extends Pessoa 
{
    private int matricula;

    public Aluno(String nome, String cpf, String email, int matricula) 
    {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() 
    {
        return this.matricula;
    }
}