package pagamento.strategy;

/**
 * Classe estratégia que valida o pagamento via dinheiro
 */
public class DinheiroStrategy implements PagamentoStrategyInterface
{
    public boolean realizarPagamento() 
    {
        //solicita o valor em dinheiro que a pessoa entregou
        // calcula o troco necessário
        // efetiva o pagamento

        return true;
    }
}