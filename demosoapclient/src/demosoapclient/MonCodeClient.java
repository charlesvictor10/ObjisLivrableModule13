package demosoapclient;

public class MonCodeClient {
	public static void main(String[] args) {
		// instanciation du service (g�n�rer par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		// R�cup�ration du client (g�n�rer par wsimport)
		HelloObjis port = monService.getHelloObjisWSPort();
		// Appel d'une op�ration du service
		String resultat = port.ditBonjour("Objis");
		System.out.println(resultat);
	}
}
