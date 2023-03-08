package version.eight.streams;

import version.eight.streams.db.ClientDAO;
import version.eight.streams.entity.Client;

public class MainStrteams {

	
	public static void main(String[] args) {
		
		ClientDAO clientDAO = new ClientDAO();
		
		clientDAO.findAll().stream().forEach( c ->  printClientData((Client) c));
		
		
	}
	
	public static void printClientData(Client client) {
		
		System.out.println(client.getName());
		System.out.println(client.getPoints());
		System.out.println(client.getAddress().getAddress());
		System.out.println(client.getAddress().getNumber());
		System.out.println(client.getAddress().getComplement());
		System.out.println(client.getAddress().getPobox());

		
	}
	
}
