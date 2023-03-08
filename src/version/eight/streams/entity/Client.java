package version.eight.streams.entity;

import java.util.List;

public class Client {
	
	private String Name;
	private int points;
	
	
	private Address address;

	List<Transactions> transactions;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	
	
}
