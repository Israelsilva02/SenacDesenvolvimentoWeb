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


try {
					parameter = JsonPath.read(plainLegacySession, "matricula");
					userName =  JsonPath.read(plainLegacySession, "$.listaUsuario[0].name");
					collaboratorType = JsonPath.read(plainLegacySession, "contributorType");
					login =  JsonPath.read(plainLegacySession, "loginAD");
					encryptedObject = JsonPath.read(plainLegacySession, "encryptedData.encryptedObject");
					log.info(String.format("PASSOU parameter: %s userName: %s collaboratorType: %s login: %s",
							parameter, userName, collaboratorType, login));

				} catch (Exception ex) {
					parameter = "BATCH";
					log.error(ERROR_SESSION_INFO, ex.getMessage(), ex.getCause());
				}
