package version.eight.streams.entity;

public enum InOutCome {
	
	INCOME("Income"),
	OUTCOME("Outcome");
	
	
	private String description;
	
	private InOutCome(String description) {
		
		this.description = description;
		
	}
	
	public String getDescription() {
		return description;
	}
	
}
