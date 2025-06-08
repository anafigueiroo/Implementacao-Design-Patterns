package pagamento.strategy;

/**
 * Classe estratégia que faz o pagamento via crédito
 */
public class CreditoStrategy implements PagamentoStrategyInterface
{
    public boolean realizarPagamento() 
    {
        //solicita os dados do cartão de crédito
        // faz conexão com o banco para validar o cartão
        // se for válido efetiva o pagamento

        return true;
    }
}
