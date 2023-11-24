/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_java;

import java.util.Date;

/**
 *
 * @author bruno
 */
public class eletrico extends Veiculo
{
    private float tcarregamento;

    public eletrico(float tempo_carregamento, String marca, String modelo, String matricula, int potencia, int capacidade, int autonimia, Date data_registo) 
    {
        super(marca, modelo, matricula, potencia, capacidade, autonimia, data_registo);
        this.tcarregamento = tempo_carregamento;
    }

    public float getTempo_carregamento() {
        return tcarregamento;
    }
    
    
    
    
    
}
