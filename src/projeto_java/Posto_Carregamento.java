/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_java;

/**
 *
 * @author bruno
 */
public class Posto_Carregamento 
{
        
    public static final byte PCN = 1;
    public static final byte PCR = 2;
    public static final byte PCUR = 3;

    
    private int codigo, tempocarregamento, custo, numveiculos;
    private String morada; 
    private byte tposto;
    public static int Max_clientes;

    public Posto_Carregamento(int codigo, int tempocarregamento, int custo, int numveiculos, String morada, byte tposto, int Max_clientes) {
        this.codigo = codigo;
        this.tempocarregamento = tempocarregamento;
        this.custo = custo;
        this.numveiculos = numveiculos;
        this.morada = morada;
        this.tposto = tposto;
        this.Max_clientes = Max_clientes;
    }
    
    
    

}
