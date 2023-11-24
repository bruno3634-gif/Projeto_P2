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
public class cliente 
{
     //nome, NIF (único), morada, contacto (email/telefónico) e data de nascimento
    private String nome,morada,email;
    private int NIF,N_telemovel;
    Date data_nascimento;
    
    //private Veiculo veiculo[] = new Veiculo[];

    public cliente(String nome, String morada, String email, int NIF, int N_telemovel, Date data_nascimento) 
    {
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.NIF = NIF;
        this.N_telemovel = N_telemovel;
        this.data_nascimento = data_nascimento;
    }
    
    
    
    
    
    
}
