package demosoapclient;

public class MonCodeClient {
	public static void main(String[] args) {
		// instanciation du service (générer par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		// Récupération du client (générer par wsimport)
		HelloObjis port = monService.getHelloObjisWSPort();
		// Appel d'une opération du service
		String resultat = port.ditBonjour("Objis");
		System.out.println(resultat);
	}
}
