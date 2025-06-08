package contrato.tipo;

import java.time.LocalDate;
import contrato.PeriodicidadeContrato;

/**
 * Classe abstrata responsável por manipular os dados padrões de um contrato
 */
public abstract class Contrato implements ContratoInterface 
{
    protected String tipoContrato = "";
    
    protected PeriodicidadeContrato periodicidadeContrato;

    protected LocalDate dataInicio;

    protected LocalDate dataFim;

    protected LocalDate dataAssinatura;

    protected LocalDate dataCancelamento;

    public enum StatusContrato 
    {
        ATIVO, CANCELADO, PENDENTE
    }

    protected StatusContrato status;

    public boolean cancelarContrato() 
    {
        this.status = StatusContrato.CANCELADO;
        this.dataCancelamento = LocalDate.now();
        return true;
    }

    public PeriodicidadeContrato getPeriodicidadeContrato() 
    {
        return this.periodicidadeContrato;
    }
}