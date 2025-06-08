package contrato;

/**
 * Classe responsável por manipular os dados dos tipos de periodicidades dos contratos
 */
public class PeriodicidadeContrato 
{
    private String descricao;
    private boolean ativo;

    public String getTipoPeriodicidadeContrato() 
    {
        return this.descricao;
    }

    public boolean isPeriodicidadeAtiva() 
    {
        return this.ativo;
    }

    public PeriodicidadeContrato cadastrarTipoPeriodicidadeContrato(String textoPeriodicidade) 
    {
        PeriodicidadeContrato periodicidade = new PeriodicidadeContrato();
        this.descricao = textoPeriodicidade;

        return periodicidade;
    }

    public boolean atualizarPeriodicidade(String novaDescricao) 
    {
        this.descricao = novaDescricao;
        return true;
    }

    public boolean deletarTipoContrato() 
    {
        this.ativo = false;
        return true;
    }
}