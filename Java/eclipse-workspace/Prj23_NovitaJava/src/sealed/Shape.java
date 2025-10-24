package sealed;

public sealed interface Shape permits Cerchio, Rettangolo {

	int getNumLati();
	
}
