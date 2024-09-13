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
    public void testAllFieldsPresent() {
        // JSON de sessão com todos os campos presentes
        String plainLegacySession = "{"
                + "\"matricula\": \"12345\","
                + "\"listaUsuario\": [{\"name\": \"John Doe\"}],"
                + "\"contributorType\": \"COLLABORATOR\","
                + "\"loginAD\": \"john.doe\","
                + "\"encryptedData\": {\"encryptedObject\": \"encryptedValue\"}"
                + "}";

        // Executa o método que estamos testando
        myClass.processSession(plainLegacySession);

        // Verifica se o log foi gerado com os valores corretos
        verify(log).info("PASSOU parameter: 12345 userName: John Doe collaboratorType: COLLABORATOR login: john.doe");
        // Também podemos verificar se o campo "parameter" não foi alterado para "BATCH"
    }

    @Test
    public void testMissingFieldsButNoException() {
        // JSON de sessão com alguns campos ausentes, mas o código deve lidar sem exceção
        String plainLegacySession = "{"
                + "\"listaUsuario\": [{\"name\": \"John Doe\"}],"
                + "\"loginAD\": \"john.doe\""
                + "}";

        // Executa o método
        myClass.processSession(plainLegacySession);

        // Verifica o log gerado com campos ausentes
        verify(log).info("PASSOU parameter: null userName: John Doe collaboratorType: null login: john.doe");
    }

    @Test
    public void testJsonWithException() {
        // JSON inválido para simular uma exceção
        String plainLegacySession = "{ invalid json }"; 

        // Executa o método
        myClass.processSession(plainLegacySession);

        // Verifica se o valor de "parameter" foi definido como "BATCH"
        // E se o log de erro foi registrado corretamente
        verify(log).error(eq("Erro ao processar sessão"), anyString(), any());
    }

    @Test
    public void testNullSessionHandling() {
        // Simulando o caso de JSON nulo ou vazio
        String plainLegacySession = null;

        // Executa o método
        myClass.processSession(plainLegacySession);

        // Verifica se a exceção foi capturada e o log de erro foi registrado
        verify(log).error(eq("Erro ao processar sessão"), anyString(), any());
    }
