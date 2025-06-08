package contrato.tipo;

import java.util.ArrayList;
import mensalidade.Mensalidade;
import pessoa.Aluno;

/**
 * Classe responsável por manipular dados de um contrato de aluno
 */
public class ContratoAluno extends Contrato 
{
    protected String tipoContrato = "Contrato de Aluno";

    private Mensalidade serviceMensalidade;

    private Aluno aluno;

    private float valorTotal;

    private int qtdParcelas;
    
    private double valorParcela;

    public ContratoAluno(Mensalidade serviceMensalidade, Aluno aluno) 
    {
        this.serviceMensalidade = serviceMensalidade;
        this.aluno = aluno;
    }

    public boolean gerarMensalidades(int qtdParcelas, double valorParcela) 
    {
        if (this.serviceMensalidade.gerarMensalidades(this.aluno, qtdParcelas, valorParcela)) {
            return true;
        }
        return false;
    }

    public ArrayList<String> gerarDetalhes() 
    {
        ArrayList<String> detalhes = new ArrayList<>();
        detalhes.add("Tipo do contrato: " + this.tipoContrato);
        detalhes.add("Nome do aluno: " + this.aluno.getNome());
        detalhes.add("Valor total: " + this.valorTotal);
        detalhes.add("Forma de pagamento: ");
        detalhes.add(this.qtdParcelas + " de R$" + String.format("%.2f", this.valorParcela));
        return detalhes;
    }

    public Contrato getContrato()
    {
        return this;
    }
}