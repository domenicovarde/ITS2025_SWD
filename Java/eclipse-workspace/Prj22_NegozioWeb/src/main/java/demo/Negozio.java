package demo;

import java.util.stream.Stream;

import model.Colore;
import model.Logo;
import model.TShirt;
import model.Taglia;

public class Negozio {

	public static void main(String[] args) {
		
		//Logo nike = new Logo(1, "nike.jpg", "Nike");
		
		TShirt ts1 = new TShirt(1, 
				Colore.BLUE, 
				Taglia.M, 
				new Logo(1, "nike.jpg", "Nike"), 
				0);
		
		Colore[] values = Colore.values();
		
		Stream.of(values).forEach(System.out::println);
		
		System.out.println(ts1);
		System.out.println(ts1.getColore().getEsadecimale());
		
	}

}
