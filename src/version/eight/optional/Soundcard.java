package version.eight.optional;

import java.util.Optional;

public class Soundcard {
	
	private Optional<Usb> usb;
	
	public Soundcard() {
		
	}
	
	public Soundcard(String usbInput) {
		usb = Optional.ofNullable(new Usb(usbInput));
	}

	public Optional<Usb> getUsb() {
		return usb;
	}

	public void setUsb(Optional<Usb> usb) {
		this.usb = usb;
	}
	

}
