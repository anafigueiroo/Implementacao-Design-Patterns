package contrato.gerador;

import contrato.tipo.Contrato;
import contrato.tipo.ContratoInstrutor;
import pessoa.Instrutor;

/**
 * Classe geradora responsável por instanciar um novo contrato de instrutor
 */
public class GeradorContratoInstrutor extends GeradorContratoAbstract 
{
    private Instrutor instrutor;

    public GeradorContratoInstrutor(Instrutor instrutor) 
    {
        this.instrutor = instrutor;
    }

    public Contrato gerarContrato() 
    {
        ContratoInstrutor contrato = new ContratoInstrutor(instrutor);
        return contrato;
    }
}