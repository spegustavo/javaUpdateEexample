package version.eight.streams.db;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import version.eight.streams.entity.Address;
import version.eight.streams.entity.Client;
import version.eight.streams.entity.InOutCome;
import version.eight.streams.entity.Transactions;

public class ClientDAO {
	
	private int NameIncrement = 0;
	private int AddressIncrement = 0;
	private int TransactionIncrement = 0;
	
	
	public Optional<List<Client>> findAll(){
		
		Optional<List<Client>> optionalClient = Optional.of(loadData());
		
		return optionalClient;
		
	}
	
	
	
	private List<Client> loadData(){
		
		List<Client> result = new ArrayList<>();
		
		for (int i = 1; i < 10; i++) {
			
			Client client = createClient(createAddress(), createTransactions());
			result.add(client);
			
		}
		
		//result.add(null);
		

		
		return result;
		
	}
	
	private List<Transactions> createTransactions() {
		
		List<Transactions> transactionsList  = new ArrayList<Transactions>();
		
		Double values = Double.valueOf(10);
		
		for (int i = 1; i <= 10; i++) {
			Transactions  transaction = new Transactions(InOutCome.INCOME, LocalDateTime.now(), values*i);
			transactionsList.add(transaction);
		}

		return  transactionsList;
			
		
	}
	
	
	private Address createAddress() {
		
		Address address = new Address();
		
		address.setAddress("Address "+getAddressIncrement());
		address.setComplement("Comp");
		address.setNumber("111"+getAddressIncrement());
		address.setPobox(""+getAddressIncrement()*100);
		
		
		return address;
		
	}
	
	private Client createClient(Address address, List<Transactions> transactionsList) {
		
		Client client = new Client();
		client.setName("Gustavo "+getNameIncrement());
		client.setPoints(0);
		client.setAddress(address);
		client.setTransactions(transactionsList);
		
		return client;
		
		
	}
	
	public int getNameIncrement() {
		return NameIncrement++;
	}


	public int getAddressIncrement() {
		return AddressIncrement++;
	}


	public int getTransactionIncrement() {
		return TransactionIncrement++;
	}
	

}
