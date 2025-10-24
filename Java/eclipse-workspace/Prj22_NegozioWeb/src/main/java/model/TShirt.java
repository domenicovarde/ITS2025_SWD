package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
public class TShirt {
	private int id;
	private Colore colore;
	private Taglia taglia;
	private Logo logo;
	private double prezzo;
}
