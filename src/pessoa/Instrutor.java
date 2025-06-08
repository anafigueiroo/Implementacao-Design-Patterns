package pessoa;

/**
 * Classe responsável por manipular os dados de um instrutor da academia
 */
public class Instrutor extends Pessoa 
{
    private String especialidade;

    public Instrutor(String nome, String cpf, String email, String especialidade) 
    {
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() 
    {
        return this.especialidade;
    }
}
