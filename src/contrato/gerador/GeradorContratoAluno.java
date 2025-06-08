package contrato.gerador;

import contrato.tipo.ContratoAluno;
import mensalidade.Mensalidade;
import pessoa.Aluno;

/**
 * Classe geradora responsável por instanciar um novo contrato de aluno
 */
public class GeradorContratoAluno extends GeradorContratoAbstract 
{
    private Aluno aluno;

    private double valorParcela;

    private int quantidadeParcelas;

    public GeradorContratoAluno(Aluno aluno, int quantidadeParcelas, double valorParcela) 
    {
        this.aluno = aluno;
        this.valorParcela = valorParcela;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public ContratoAluno gerarContrato() 
    {
        ContratoAluno contrato = new ContratoAluno(new Mensalidade(this.valorParcela), aluno);
        
        contrato.gerarMensalidades(quantidadeParcelas, valorParcela);
        
        return contrato;
    }
}