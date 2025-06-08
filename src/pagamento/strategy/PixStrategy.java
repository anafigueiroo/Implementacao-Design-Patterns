package pagamento.strategy;

/**
 * Classe estratégia que faz o pagamento via pix
 */
public class PixStrategy implements PagamentoStrategyInterface
{
    public boolean realizarPagamento() 
    {
        // gera uma chave pix no banco para pagamento
        // faz a leitura da chave pix
        // verifica no banco se o pagamento foi aprovado
        // efetiva o pagamento
        
        return true;
    }
}