package mensalidade;

import pessoa.Aluno;

/**
 * Classe responsável por manipular os dados das mensalidades
 */
public class Mensalidade 
{
    private double valor;

    public Mensalidade(double valor) 
    {
        this.valor = valor;
    }

    public boolean gerarMensalidades(Aluno aluno, int qtdParcelas, double valorParcela)
    {
        return true;
    }

    public String getValorMensalidade()
    {
        return "R$ " + this.valor;
    }
}
