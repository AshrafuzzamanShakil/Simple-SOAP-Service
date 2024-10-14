package testing;

import com.soap.ws.client.TextCasing;
import com.soap.ws.client.TextCasingSoapType;

public class TC_testing {
	
	public static String lowwercase(String inputStr) {
		//String input_N = new String(inputStr);
		TextCasing TC_service = new TextCasing(); //created service object
		TextCasingSoapType TC_serviceSOAP = TC_service.getTextCasingSoap(); //create SOAP object (a port of the service)
        String result = TC_serviceSOAP.allLowercaseWithToken(inputStr,"");  
        return result;
	}
	public static String uppercase(String inputStr) {
		//String input_N = new String(inputStr);
		TextCasing TC_service = new TextCasing(); //created service object
		TextCasingSoapType TC_serviceSOAP = TC_service.getTextCasingSoap(); //create SOAP object (a port of the service)
        String result = TC_serviceSOAP.allUppercaseWithToken(inputStr,"");
        return result;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for 'ABCD' number is: "+ lowwercase("zaABCD"));
		System.out.println("for 'xyz' number is: "+ uppercase("Acszxyz"));
		

	}

}
