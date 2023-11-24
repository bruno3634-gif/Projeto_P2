/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_java;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author bruno
 */
public class Veiculo 
{

    protected String marca, modelo, matricula;
    protected int potencia, capacidade,autonimia;
    protected Date data_registo = null;

    
    
    
    public Veiculo(String marca, String modelo, String matricula, int potencia, int capacidade, int autonimia, Date data_registo) 
    {

        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.capacidade = capacidade;
        this.autonimia = autonimia;
        this.data_registo = data_registo;
    }

    public String getMarca() {
        return marca;
    }

   
    public String getModelo() {
        return modelo;
    }

   
    public String getMatricula() {
        return matricula;
    }

    
    public int getPotencia() {
        return potencia;
    }

    
    public int getCapacidade() {
        return capacidade;
    }

  

    public int getAutonimia() {
        return autonimia;
    }

   
    public Date getData_registo() {
        return data_registo;
    }

        
    
}


