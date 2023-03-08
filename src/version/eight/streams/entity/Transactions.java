package version.eight.streams.entity;

import java.time.LocalDateTime;

public class Transactions {

	private InOutCome inOutCome;
	private LocalDateTime localDateTime;
	private Double value;
	
	public Transactions(InOutCome inOutCome, LocalDateTime localDateTime, Double value) {
		setInOutCome(inOutCome);
		setLocalDateTime(localDateTime);
		setValue(value);
	}

	public InOutCome getInOutCome() {
		return inOutCome;
	}

	public void setInOutCome(InOutCome inOutCome) {
		this.inOutCome = inOutCome;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
