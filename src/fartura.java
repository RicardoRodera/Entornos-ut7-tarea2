
/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class fartura {
	double total;
	double subtotal;
	private static final double VALUE_IVA = 0.21;
	private static final double VALUE_IVA_REDUCED = 0.04;
	private static final double DISCOUNT = 0.1;
	
	public fartura (double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void ivareduced () {
		total = subtotal + (subtotal * VALUE_IVA_REDUCED);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {

		total = subtotal + (subtotal * VALUE_IVA);
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void descuentoesp () {
		total = subtotal + (subtotal * VALUE_IVA);
		total = total - (total * DISCOUNT);
	}

}
