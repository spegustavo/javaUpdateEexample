package version.eight.optional;

import java.util.Optional;

/**
 * 
 * @author Gustavo.duarte
 * 
 * {@link https://www.oracle.com/technical-resources/articles/java/java8-optional.html}
 * 
 *         Optional in a Nutshell Java SE 8 introduces a new class called
 *         java.util.Optional<T> that is inspired from the ideas of Haskell and
 *         Scala. It is a class that encapsulates an optional value. You can view Optional
 *         as a single-value container that either contains a value or doesn't
 *         (it is then said to be "empty")
 * 
 *
 */

public class MainOptional {
	

	public static void main(String[] args) {
		
		Computer computer = new Computer();
			
		Optional<Computer> computerOp = Optional.of(computer);
		
		computerOp.flatMap(Computer::getSoundcard)
			.flatMap(Soundcard::getUsb)
			.map(Usb::getVersion)
			.orElse("Unknown");
		
		Soundcard soundcard = new Soundcard();
		Usb usbCrate = new Usb("V1");
		soundcard.setUsb(Optional.ofNullable(null));
		
		Optional<Soundcard> sc = Optional.of(soundcard);
		
		sc.ifPresent(System.out::println);
		
		//Provides empty value if the optional is empty
		Optional<Usb>  usb = sc.get().getUsb();
		
		Usb usbPresent = usb.orElse(new Usb("Default"));
		
		System.out.println(usbPresent.getVersion());
		
		
		Optional<Soundcard> scEmpty = Optional.empty();
		
		Optional<Soundcard> scNullable = Optional.ofNullable(null);
		
		//Not Printed
		scNullable.ifPresent(System.out::println);
		
		//Provides empty value if the optional is empty
		Soundcard soundcardOrElse = scEmpty.orElse(new Soundcard("defaut"));
		
		System.out.println(soundcardOrElse.getUsb());
		
		
		
		
		
		
	}
	
}
