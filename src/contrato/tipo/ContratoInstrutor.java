package contrato.tipo;
import java.util.ArrayList;

import pessoa.Instrutor;

/**
 * Classe responsável por manipular dados de um contrato de instrutor
 */
public class ContratoInstrutor extends Contrato
{
    protected String tipoContrato = "Contrato de Instrutor";
    private Instrutor instrutor;
    private float salarioInstrutor;
    private int cargaHoraria;

    public ContratoInstrutor(Instrutor instrutor)
    {
        this.instrutor = instrutor;
    }

    public ArrayList<String> gerarDetalhes() 
    {
        ArrayList<String> detalhes = new ArrayList<>();
        detalhes.add("Tipo do contrato: " + this.tipoContrato);
        detalhes.add("Nome do instrutor: " + this.instrutor.getNome());
        detalhes.add("Salário: " + String.format("%.2f", this.salarioInstrutor));
        detalhes.add("Carga horária: " + this.cargaHoraria);
        return detalhes;
    }

    public Contrato getContrato()
    {
        return this;
    }
}