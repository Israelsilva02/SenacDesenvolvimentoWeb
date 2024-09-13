/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulahoje;

/**
 *
 * @author israel.bsilva8
 */
public class Atividade {
    public static void main(String[] args) {
        
        for(int a=0, b=1, i=0; i<13; b+=a, a=b-a, i++) {
			         System.out.println(a+ "");
		}  
       
    }
    
}


@Test
    public void testMissingFields() {
        // Simulando o plainLegacySession faltando campos
        String plainLegacySession = "{"
                + "\"listaUsuario\": [{\"name\": \"John Doe\"}],"
                + "\"loginAD\": \"john.doe\""
                + "}";

        // Executando o código que será testado
        myClass.processSession(plainLegacySession);

        // Verificando se os logs foram registrados corretamente
        verify(log).info("PASSOU parameter: null userName: John Doe collaboratorType: null login: john.doe");
    }

    @Test
    public void testExceptionHandling() {
        // Simulando uma exceção no JsonPath
        String plainLegacySession = "{invalid json}";

        // Executando o código que será testado
        myClass.processSession(plainLegacySession);

        // Verificando se os valores padrão foram aplicados e o log de erro foi chamado
        verify(log).error(eq("Erro ao processar sessão"), anyString(), any());
    }
