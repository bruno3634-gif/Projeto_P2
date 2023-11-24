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
public class hibridos extends Veiculo
{
    private int clilindrada;
    private String combustivel;

    public hibridos(int clilindrada, String combustivel, String marca, String modelo, String matricula, int potencia, int capacidade, int autonimia, Date data_registo) 
    {
        super(marca, modelo, matricula, potencia, capacidade, autonimia, data_registo);
        this.clilindrada = clilindrada;
        this.combustivel = combustivel;
    }

    
    
    
    
    
}
