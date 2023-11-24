/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.Consola;

/**
 *
 * @author Bruno Vicente
 * @author Duarte Fernandes
 */
public class Projeto_java {

    /**
     *
     */
    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String argString[]) {
        // TODO code application logic here
        int opcao, op;
        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                    do {
                        op = submenu1();
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                        }
                    } while (op != 0);
                    break;
                case 2:
                    do {
                        op = submenu2();
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                        }
                    } while (op != 0);
                    break;
                case 3:
                    do {
                        op = submenu3();
                        switch (op) {
                            case 1:
                                criar_posto();
                                op = 0;
                                break;
                            case 2:

                                break;
                        }
                    } while (op != 0);
                    break;
                case 4:
                    do {
                        op = submenu4();
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                        }
                    } while (op != 0);
                    break;
                case 5:
                    do {
                        op = submenu5();
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                        }
                    } while (op != 0);
                    break;
                case 6:
                    do {
                        op = submenu6();
                        switch (op) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;
                        }
                    } while (op != 0);
                    break;
                default:
            }
        } while (opcao != 0);

    }

    public static int menu() {
        System.out.println("1 - Inserir e consultar (atraves de matricula) os veiculos registados");
        System.out.println("2 - Inserir, consultar (atraves de NIF) e alterar dados dos clientes registados");
        System.out.println("3 - Inserir, consultar (atraves de codigo) os postos de carregamento");
        System.out.println("4 - Registar e consultar sessao de carregamento");
        System.out.println("5 - Registar e consultar (por sessao) o pagamento de servico de carregamento");
        System.out.println("6 - Outras consultas");
        System.out.println("0 - Sair");
        int op = Consola.lerInt("Opcao: ", 0, 6);
        return op;
    }

    public static int submenu1() {
        System.out.println("1 - Inserir veiculo");
        System.out.println("2 - Consultar veiculo (Por matricula)");
        System.out.println("0 - Voltar");
        int op = Consola.lerInt("Opcao: ", 0, 2);
        return op;
    }

    public static int submenu2() {
        System.out.println("1 - Inserir cliente");
        System.out.println("2 - Consultar cliente (NIF)");
        System.out.println("3 - Alterar dados de cliente (NIF)");
        System.out.println("0 - Voltar");
        int op = Consola.lerInt("Opcao: ", 0, 3);
        return op;
    }

    public static int submenu3() {
        System.out.println("1 - Inserir Posto de carregamento");
        System.out.println("2 - Consultar posto de carregamento (codigo)");
        System.out.println("0 - Voltar");
        int op = Consola.lerInt("Opcao: ", 0, 2);
        return op;
    }

    public static int submenu4() {
        System.out.println("1 - Registar sessao de carregamento");
        System.out.println("2 - Consultar carregamentos");
        System.out.println("0 - Voltar");
        int op = Consola.lerInt("Opcao: ", 0, 2);
        return op;
    }

    public static int submenu5() {
        System.out.println("1 - Registar pagamento de sessao de carregamento");
        System.out.println("2 - Consultar pagamentos de sessoes de carregamento");
        System.out.println("0 - Voltar");
        int op = Consola.lerInt("Opcao: ", 0, 2);
        return op;
    }

    public static int submenu6() {
        System.out.println("1 - Listagem dos 3 postos de carregamento com maior valor faturado (liquidado)");
        System.out.println("2 - Listagem de sessoes de carregamento cujo custo e superior a 'n' euros. Sendo o valor de 'n' solicitado ao utilizador");
        System.out.println("3 - Total de sessoes de carregamento realizados (por cliente)");
        System.out.println("4 - Media de energia consumida por posto de carregamento e por tipo de veiculo (hibridos/eletricos)");
        System.out.println("5 - Listagem de pagamentos por efetuar (por cliente)");
        System.out.println("6 - Historico de sessoes de carregamento (por posto de carregamento)");
        System.out.println("0 - Voltar");

        int op = Consola.lerInt("Opcao: ", 0, 6);
        return op;
    }

    public static Date ler_data() {
        String inData;
        Date data = null;

        /* pedir data ao utilizador com proteção de erro */
        boolean erroData;
        do {
            erroData = false;
            try {
                inData = Consola.lerString("Indique a data: ");
                data = dateFormat.parse(inData);

            } catch (ParseException e) {
                erroData = true;
                System.out.println("O formato da data é invalido!");
            }
        } while (erroData);

        return data;
    }

    public static void criar_posto() {
        byte tposto;
        int op;
        do {
            op = subsubmenu();
            switch (op) {
                case 1:
                    tposto = Posto_Carregamento.PCN;
                    break;
                case 2:
                    tposto = Posto_Carregamento.PCR;
                    break;
                case 3:
                    tposto = Posto_Carregamento.PCUR;
                    break;
            }

        } while (op != 1 && op != 2 && op != 3);
    }

    public static int subsubmenu() {
        System.out.println("1 - Posto de Carregamento Normal(PCN)");
        System.out.println("2 - Posto de Carregamento Rápido (PCR)");
        System.out.println("3 - Posto de Carregamento Ultrarrápido (PCUR)");
        int op = Consola.lerInt("Opcao: ", 1, 3);
        return op;
    }
    
    
    
    

}
