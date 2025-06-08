package pagamento.strategy;

/**
 * Classe estratégia que faz o pagamento via débito
 */
public class DebitoStrategy implements PagamentoStrategyInterface
{
    public boolean realizarPagamento() 
    {
        //solicita os dados do cartão de débito
        //valida se o cartão é valido no sistema de banco
        // se for válido faz o pagamento

        return true;
    }
}