package model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TShirt {
	private int id;
	private Colore colore;
	private Taglia taglia;
	private Logo logo;
	private double prezzo;
}
