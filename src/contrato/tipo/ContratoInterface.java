package contrato.tipo;

import java.util.ArrayList;

/**
 * Interface comum para um tipo de contrato contendo os métodos que eles devem implementar
 */
public interface ContratoInterface 
{
    Contrato getContrato();

    ArrayList<String> gerarDetalhes();

    boolean cancelarContrato();
}