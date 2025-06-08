package contrato.gerador;

import contrato.tipo.Contrato;

/**
 * Classe abstrata para uma factory de contrato
 */
public abstract class GeradorContratoAbstract 
{
    public abstract Contrato gerarContrato();
}