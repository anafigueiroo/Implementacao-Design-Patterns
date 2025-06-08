package pagamento;

import pagamento.strategy.CreditoStrategy;
import pagamento.strategy.DebitoStrategy;
import pagamento.strategy.DinheiroStrategy;
import pagamento.strategy.PagamentoStrategyInterface;
import pagamento.strategy.PixStrategy;

/**
 * Classe responsável por efetivar o pagamento da mensalidade
 */
public class Pagamento 
{
    private PagamentoStrategyInterface pagamentoStrategy;

    /**
     * Método construtor que recebe a forma de pagamento que a pessoa selecionou e instancia a classe da estratégia 
     * de pagamento que será realizada
     */
    public Pagamento(String formaPagamento)
    {
        switch (formaPagamento) {
            case "dinheiro": this.pagamentoStrategy = new DinheiroStrategy();
                break;
            case "pix": this.pagamentoStrategy = new PixStrategy();
                break;
            case "debito": this.pagamentoStrategy = new DebitoStrategy();
                break;
            case "credito": this.pagamentoStrategy = new CreditoStrategy();
                break;
        }
    }

    public boolean realizarPagamento()
    {
        return this.pagamentoStrategy.realizarPagamento();
    }
}